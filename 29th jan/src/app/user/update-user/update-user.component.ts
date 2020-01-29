import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { TestService } from 'src/app/service/test.service';
import { User } from 'src/app/models/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {

  updateUser : FormGroup;
  constructor(private formBuilder: FormBuilder, private userService:TestService, private router: Router) { }

  ngOnInit() {
    this.updateUser = this.formBuilder.group({
      id: [],
      name: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', Validators.required]
    });

    const id = localStorage.getItem('userId');
    if(+id > 0){
      this.userService.getUserById(+id).subscribe(user => {
             this.updateUser.patchValue(user);
      });
    }
  }
  updateTheUser(){
    this.userService.updateUserInfo(this.updateUser.value).subscribe(u => {
      this.router.navigate(['users']);
    });
  }
  onSubmit(){
    console.log(this.updateUser.value);
  }

}
