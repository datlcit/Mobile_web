import { Component, OnInit } from '@angular/core';
import { CustomerAdminService } from '../../adminServices/customer-admin.service';

@Component({
  selector: 'app-list-customers',
  templateUrl: './list-customers.component.html',
  styleUrls: ['./list-customers.component.css']
})
export class ListCustomersComponent implements OnInit {

  constructor(private customerAdminService : CustomerAdminService) { }

  ngOnInit(): void {
    this.loadCustomers();
  }

  listCustomers: Array<any> = [];
  loadCustomers(){
    this.customerAdminService.get().subscribe(res =>{
      this.listCustomers = res;
    })
  }

}
