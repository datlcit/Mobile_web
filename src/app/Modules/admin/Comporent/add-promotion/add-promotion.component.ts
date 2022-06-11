import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { PromotionAdminService } from '../../adminServices/promotion-admin.service';

@Component({
  selector: 'app-add-promotion',
  templateUrl: './add-promotion.component.html',
  styleUrls: ['./add-promotion.component.css']
})
export class AddPromotionComponent implements OnInit {

  formAddPromotion = this.fb.group({
    promotionName: ['', Validators.required],
    startTime: ['', Validators.required],
    endTime: ['', Validators.required],
    applyDay: ['', Validators.required],
    quantity: ['', Validators.required],
    maxDiscount: ['', Validators.required],
    remainApply: ['', Validators.required],
    status: ['', Validators.required],
    code: ['', Validators.required],
  });
  submitted = false;

  constructor(private promotionAdminService: PromotionAdminService,
    private route: ActivatedRoute,
    private fb: FormBuilder,
    private router: Router,
    private http: HttpClient) { }

  ngOnInit(): void {
    let promotionId = this.route.snapshot.params['promotionId'];
    this.promotionAdminService.findById(promotionId).subscribe(res =>console.log(res)
    );
  }

  addPromotion(){
    this.promotionAdminService.add(this.formAddPromotion.value).subscribe(res=>{
      console.log(this.formAddPromotion.value);
      this.router.navigateByUrl('/admin/listPromotions')
    })
  }

}
