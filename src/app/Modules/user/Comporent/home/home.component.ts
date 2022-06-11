import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { LazyLoadServiceService } from '../../userServices/lazy-load-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  best_seller_products:any[] = [
    {
      pId: 'P101',
      pName: 'Iphone 12',
      img1: 'assets/img/product/iphone/iphone_12_series/iphone_12_den.png',
      old_price: 16390000,
      old_price_view: '16,390,000',
      current_price: 16090000,
      current_price_view: '16,090,000'
    },
    {
      pId: 'P202',
      pName: 'Samsung Galaxy ZFold3 5g',
      img1: 'assets/img/product/samsung/Samsung_Galaxy_Z_Series/Samsung_Galaxy_Z_Fold3_5G _den.png',
      old_price: 34190000,
      old_price_view: '34,190,000',
      current_price: 33190000,
      current_price_view: '33,190,000'
    },
    {
      pId: 'P322',
      pName: 'Xiaomi 12 Pro',
      img1: 'assets/img/product/xiaomi/Xiaomi_12_series/Xiaomi_12_pro_tim.png',
      old_price: 26990000,
      old_price_view: '26,990,000',
      current_price: 25990000,
      current_price_view: '25,990,000'
    },
    {
      pId: 'P102',
      pName: 'Iphone 12 Mini',
      img1: 'assets/img/product/iphone/iphone_12_series/iphone_12_mini_trang.png',
      old_price: 16950000,
      old_price_view: '16,950,000',
      current_price: 15950000,
      current_price_view: '15,950,000'
    },
    {
      pId: 'P211',
      pName: 'Samsung Galaxy S22',
      img1: 'assets/img/product/samsung/Samsung_S22_series/Samsung_Galaxy S22_hong.png',
      old_price: 17350000,
      old_price_view: '17,350,000',
      current_price: 17000000,
      current_price_view: '17,000,000'
    },
    {
      pId: 'P312',
      pName: 'Redmi Note 11 Pro',
      img1: 'assets/img/product/xiaomi/Redmi_note_11_series/Redmi_Note_11_Pro_xam.png',
      old_price: 7490000,
      old_price_view: '7,490,000',
      current_price: 7290000,
      current_price_view: '7,290,000'
    }
  ]

  new_products:any[] = [
    {
      pId: 'P321',
      pName: 'Xiaomi 12',
      img1: 'assets/img/product/xiaomi/Xiaomi_12_series/Xiaomi_12_xanh.png',
      old_price: null,
      old_price_view: null,
      current_price: 18990000,
      current_price_view: '18,990,000'
    },
    {
      pId: 'P311',
      pName: 'Redmi Note 11',
      img1: 'assets/img/product/xiaomi/Redmi_note_11_series/Redmi_Note_11_trang.png',
      old_price: null,
      old_price_view: null,
      current_price: 4690000,
      current_price_view: '4,690,000'
    },
    {
      pId: 'P212',
      pName: 'Samsung Galaxy S22 Ultra',
      img1: 'assets/img/product/samsung/Samsung_S22_series/Samsung_Galaxy S22_ultra_tim.png',
      old_price: null,
      old_price_view: null,
      current_price: 25650000,
      current_price_view: '25,650,000'
    },
    {
      pId: 'P201',
      pName: 'Samsung Galaxy Z Flip3 5G',
      img1: 'assets/img/product/samsung/Samsung_Galaxy_Z_Series/Samsung_Galaxy_Z_Flip3_5G_vang.png',
      old_price: null,
      old_price_view: null,
      current_price: 20650000,
      current_price_view: '20,650,000'
    },
    {
      pId: 'P111',
      pName: 'Iphone 13',
      img1: 'assets/img/product/iphone/iphone_13_series/iphone_13_do.png',
      old_price: null,
      old_price_view: null,
      current_price: 20390000,
      current_price_view: '20,390,000'
    },
    {
      pId: 'P112',
      pName: 'Iphone 13 Pro Max',
      img1: 'assets/img/product/iphone/iphone_13_series/iphone_13_pro_max_xanh_duong.png',
      old_price: null,
      old_price_view: null,
      current_price: 28950000,
      current_price_view: '28,950,000',
    }
  ]

  sale_products:any[] = [
    {
      pId: 'P101',
      pName: 'Iphone 12',
      img1: 'assets/img/product/iphone/iphone_12_series/iphone_12_den.png',
      old_price: 16390000,
      old_price_view: '16,390,000',
      current_price: 16090000,
      current_price_view: '16,090,000'
    },
    {
      pId: 'P202',
      pName: 'Samsung Galaxy ZFold3 5g',
      img1: 'assets/img/product/samsung/Samsung_Galaxy_Z_Series/Samsung_Galaxy_Z_Fold3_5G _den.png',
      old_price: 34190000,
      old_price_view: '34,190,000',
      current_price: 33190000,
      current_price_view: '33,190,000'
    },
    {
      pId: 'P322',
      pName: 'Xiaomi 12 Pro',
      img1: 'assets/img/product/xiaomi/Xiaomi_12_series/Xiaomi_12_pro_tim.png',
      old_price: 26990000,
      old_price_view: '26,990,000',
      current_price: 25990000,
      current_price_view: '25,990,000'
    },
    {
      pId: 'P102',
      pName: 'Iphone 12 Mini',
      img1: 'assets/img/product/iphone/iphone_12_series/iphone_12_mini_trang.png',
      old_price: 16950000,
      old_price_view: '16,950,000',
      current_price: 15950000,
      current_price_view: '15,950,000'
    },
    {
      pId: 'P211',
      pName: 'Samsung Galaxy S22',
      img1: 'assets/img/product/samsung/Samsung_S22_series/Samsung_Galaxy S22_hong.png',
      old_price: 17350000,
      old_price_view: '17,350,000',
      current_price: 17000000,
      current_price_view: '17,000,000'
    },
    {
      pId: 'P312',
      pName: 'Redmi Note 11 Pro',
      img1: 'assets/img/product/xiaomi/Xiaomi_12_series/Xiaomi_12_pro_tim.png',
      old_price: 7490000,
      old_price_view: '7,490,000',
      current_price: 7290000,
      current_price_view: '7,290,000'
    }
  ]

  featured_products:any[] = [
    {
      pId: 'P101',
      pName: 'Iphone 12',
      img1: 'assets/img/product/iphone/iphone_12_series/iphone_12_den.png',
      old_price: 16390000,
      old_price_view: '16,390,000',
      current_price: 16090000,
      current_price_view: '16,090,000'
    },
    {
      pId: 'P311',
      pName: 'Redmi Note 11',
      img1: 'assets/img/product/xiaomi/Redmi_note_11_series/Redmi_Note_11_trang.png',
      old_price: null,
      old_price_view: null,
      current_price: 4690000,
      current_price_view: '4,690,000'
    },
    {
      pId: 'P202',
      pName: 'Samsung Galaxy ZFold3 5g',
      img1: 'assets/img/product/samsung/Samsung_Galaxy_Z_Series/Samsung_Galaxy_Z_Fold3_5G _den.png',
      old_price: 34190000,
      old_price_view: '34,190,000',
      current_price: 33190000,
      current_price_view: '33,190,000'
    },
    {
      pId: 'P322',
      pName: 'Xiaomi 12 Pro',
      img1: 'assets/img/product/xiaomi/Xiaomi_12_series/Xiaomi_12_pro_tim.png',
      old_price: 26990000,
      old_price_view: '26,990,000',
      current_price: 25990000,
      current_price_view: '25,990,000'
    },
    {
      pId: 'P102',
      pName: 'Iphone 12 Mini',
      img1: 'assets/img/product/iphone/iphone_12_series/iphone_12_mini_trang.png',
      old_price: 16950000,
      old_price_view: '16,950,000',
      current_price: 15950000,
      current_price_view: '15,950,000'
    },
    {
      pId: 'P321',
      pName: 'Xiaomi 12',
      img1: 'assets/img/product/xiaomi/Xiaomi_12_series/Xiaomi_12_xanh.png',
      old_price: null,
      old_price_view: null,
      current_price: 18990000,
      current_price_view: '18,990,000'
    },
    {
      pId: 'P112',
      pName: 'Iphone 13 Pro Max',
      img1: 'assets/img/product/iphone/iphone_13_series/iphone_13_pro_max_xanh_duong.png',
      old_price: null,
      old_price_view: null,
      current_price: 28950000,
      current_price_view: '28,950,000',
    },
    {
      pId: 'P312',
      pName: 'Redmi Note 11 Pro',
      img1: 'assets/img/product/xiaomi/Xiaomi_12_series/Xiaomi_12_pro_tim.png',
      old_price: 7490000,
      old_price_view: '7,490,000',
      current_price: 7290000,
      current_price_view: '7,290,000'
    }
  ]

  constructor(private lazyLoad: LazyLoadServiceService) { }

  ngOnInit(): void {
    this.lazyLoad.loadScript('assets/js/main.js').subscribe(_ => {
    });
  }

  // @Input() items: any[] = [];
  @Output() clickBuy: EventEmitter<any> = new EventEmitter();
  addPro(pId: string): void {
    this.clickBuy.emit(pId);
  }

  @Output() clickTotal: EventEmitter<any> = new EventEmitter();
  addTotal(current_price: number): void {
    this.clickTotal.emit(current_price);
    console.log(current_price)
  }

  @Output() clickWithlist: EventEmitter<any> = new EventEmitter();
  addToWishList(pId: string): void {
    this.clickWithlist.emit(pId);
  }
}
