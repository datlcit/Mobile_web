import { Component, OnInit } from '@angular/core';
import { LazyLoadScriptService } from '../../adminServices/lazy-load-script.service';
import { ListOrdersComponent } from '../list-orders/list-orders.component';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  constructor(private lazyLoad: LazyLoadScriptService) { }

  ngOnInit(): void {
    this.lazyLoad.loadScript('assets/dist/js/adminlte.min.js').subscribe(_ => {
    });
  }

  // orderId:number = 0;
  // details(componentRef:any) {
  //   if(componentRef instanceof ListOrdersComponent) {
  //     componentRef.clickOrderDetail.subscribe((orderId) => {
  //       this.orderId = orderId;
  //       console.log( this.orderId)
  //     })
  //   }
  // }

}
