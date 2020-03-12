import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Company } from 'src/app/models/company';
import { Observable } from 'rxjs';
import { startWith , map } from 'rxjs/operators';
import { CompanyService } from 'src/app/adminhome/companydetails.com/companyService/company.service';

@Component({
  selector: 'app-comparecompany',
  templateUrl: './comparecompany.component.html',
  styleUrls: ['./comparecompany.component.css']
})
export class ComparecompanyComponent implements OnInit {

  comparecompany: FormGroup;
  options : Company[];
  filteredOptions: Observable<Company[]>;
  
  constructor(private formBuilder:FormBuilder, private router:Router, private companyService:CompanyService) { }


  ngOnInit() {
    this.comparecompany = this.formBuilder.group({
      company:['',Validators.required],
      stockExchange:['',Validators.required],
      companyname:['',Validators.required],
      datefrom:['',Validators.required],
      dateto:['',Validators.required]
    });
    
    this.companyService.getAllCompany().subscribe(u => {
      this.options = u;
    }); 

  }

  compareTheCompany(){
    console.log(this.comparecompany.value);
    // this.router.navigate(['charts']);
  }

  onSubmit(){
    this.router.navigate(['charts']),{ // "/result" --> highcharts page
       queryParams: {
         formData: JSON.stringify(this.comparecompany.value) //
       }
    }
  }

}
