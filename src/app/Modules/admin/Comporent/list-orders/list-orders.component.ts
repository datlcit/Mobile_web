import { Component, OnInit } from '@angular/core';
import { CustomerAdminService } from '../../adminServices/customer-admin.service';
import { OrderAdminService } from '../../adminServices/order-admin.service';

@Component({
  selector: 'app-list-orders',
  templateUrl: './list-orders.component.html',
  styleUrls: ['./list-orders.component.css']
})
export class ListOrdersComponent implements OnInit {

  constructor(private orderAdminService : OrderAdminService) { }

  ngOnInit(): void {
    this.loadOrders();
  }

  listOrders: Array<any> = [];
  loadOrders(){
    this.orderAdminService.get().subscribe(res => {

      this.listOrders = res;
    })
  }

}
