import { Component, OnInit } from '@angular/core';
import { TestService } from '../test.service'

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

    
  constructor(private testService: TestService) { }
  today : any;
  getDate(){
    this.today = this.testService.getTodayDate();
  }

  ngOnInit() {
    this.getDate();
  }

}
