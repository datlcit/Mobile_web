import { Component, OnInit } from '@angular/core';
import { PromotionAdminService } from '../../adminServices/promotion-admin.service';

@Component({
  selector: 'app-list-promotions',
  templateUrl: './list-promotions.component.html',
  styleUrls: ['./list-promotions.component.css']
})
export class ListPromotionsComponent implements OnInit {

  constructor(private promotionAdminService : PromotionAdminService) { }

  ngOnInit(): void {
    this.loadPromotions();
  }

  listPromotions: Array<any> = [];
  loadPromotions(){
    this.promotionAdminService.get().subscribe(res => {
      this.listPromotions = res;
    })
  }

}
