import { Component, OnInit } from '@angular/core';
import { TestService } from 'src/app/service/test.service';
import { User } from '../../models/user'
import { Router } from '@angular/router';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {


  constructor(private userService: TestService, private router: Router) { }
  
  
  usersTanu: User[];
  ngOnInit() {
    //this.usersTanu = this.userService.getAllUsers();
   this.userService.getAllUsers().subscribe(data => {
     this.usersTanu = data;
   });
  
  }
  deleteUser(user : User){
    this.userService.deleteUser(user.id).subscribe();
    this.usersTanu = this.usersTanu.filter(u => user != user);
  }
  updateUser(user : User){
    localStorage.removeItem('userId');
    localStorage.setItem('userId', user.id.toString());
    this.router.navigate(['update-user']);
  }

}
