import { Component, OnInit,  Output, EventEmitter } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { TestService } from 'src/app/service/test.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

 registerUser: FormGroup;
  
  constructor(private formBuilder: FormBuilder,private testService: TestService) { }

  ngOnInit() {
       this.registerUser= this.formBuilder.group({
         id: ['', Validators.required],
         name: ['', Validators.required],
         email: ['',[ Validators.required,Validators.email]],
         phone: ['', Validators.required]
       });
  }

  addUser(){
     this.testService.saveUser(this.registerUser.value).subscribe(data => {
       console.log('User Inserted Successfully');
     });
  }


  onSubmit(){
    console.log(this.registerUser.value);
  }


}
