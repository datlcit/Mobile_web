import { Component, EventEmitter, OnInit, Output } from '@angular/core';
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

  @Output() clickOrderDetail: EventEmitter<any> = new EventEmitter();
  details(orderId: number){
    this.clickOrderDetail.emit(orderId);
    console.log(orderId);
  }

}
