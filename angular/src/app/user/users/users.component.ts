import { Component, OnInit } from '@angular/core';
import { TestService } from 'src/app/service/test.service';
import { User } from '../../models/user'

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {


  constructor(private userService: TestService) { }
  
  
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

}
