import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { CustomerAdminService } from '../../adminServices/customer-admin.service';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {

  constructor(
    private fb: FormBuilder,
    private route: ActivatedRoute,
    private customerAdminService: CustomerAdminService,
    private http: HttpClient
  ) { }

  ngOnInit(): void {
  }

  formAddCustomer = this.fb.group({
    customerId: ['', Validators.required],
    fullName: ['', Validators.required],
    password: ['', Validators.required],
    phone: ['', Validators.required],
    address: ['', Validators.required],
    email: ['', Validators.required],
    avatar: ['', Validators.required],
    status: ['', Validators.required]
  });

  submitted = false;

  addCustomer(){
    this.customerAdminService.add(this.formAddCustomer.value).subscribe(res=>{
      console.log(this.formAddCustomer.value);
    })
  }

}
