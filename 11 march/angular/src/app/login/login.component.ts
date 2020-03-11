import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, FormBuilder, Validators } from '@angular/forms'
import { ServiceService } from '../service.service';
import { User } from '../models/users';
import { Router } from '@angular/router';
import { AuthServiceService } from '../service/auth-service.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;
  users: User[];
  currentUser: User;
  //users : USERS;
  constructor(private service:ServiceService, private formBuilder: FormBuilder, private router:Router, private auth:AuthServiceService) { }

  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      //id:['',Validators.required],
      username:['',Validators.required],
      password:['',Validators.required]
    });
    this.service.getAllUsers().subscribe(u => {
      this.users = u;
    });
  }

   isValid(){
    
       let username = this.loginForm.get("username").value;
       let password = this.loginForm.get("password").value;
       const result$ = this.auth.authenticate(username,password);
       result$.subscribe(data => {
         console.log(data);
         if(data.userType == "ROLE_ADMIN"){
          this.router.navigate(['/adminhome']);
         }else{
        this.router.navigate(['/userhome']);
    }
   });
   }
  //   let admin_userName="admin";
  //   let admin_password="admin";
  //   let userName = this.loginForm.controls.username.value;
  //   let password = this.loginForm.controls.password.value;

  //   if((userName == admin_userName) && (password == admin_password)){
  //     this.router.navigate(['adminhome']);
  //   }else{
  //     if( this.login(userName, password)){
  //       if(this.service.isActivated(this.currentUser)){
  //         localStorage.removeItem('userId');
  //         localStorage.setItem('userId',this.currentUser.id.toString());
  //         this.router.navigate(['userhome']);
  //       }else{
  //         alert("please activate your account to login ");
  //       } 
        
  //       }else{
  //         alert(" Invalid username or Password");
  //         this.loginForm.reset();
  //       }
  //     }
  //   }

  //   login(userName:string, password: string){
  //     for(let user of this.users ){
  //       if((userName == user.username) && (password == user.password)){
  //         this.currentUser= user;
  //         return true;
  //       }
  //     }
  //     return false;
  //   }

  onSubmit(){
    console.log(this.loginForm.value);
  }

 }
  


