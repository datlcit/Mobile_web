import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { PromotionAdminService } from '../../adminServices/promotion-admin.service';

@Component({
  selector: 'app-edit-promotion',
  templateUrl: './edit-promotion.component.html',
  styleUrls: ['./edit-promotion.component.css']
})
export class EditPromotionComponent implements OnInit {

  formEditPromotion = this.fb.group({
    promotionId: [''],
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

    data:any = null;
    ngOnInit(): void {
      let promotionId = this.route.snapshot.params['promotionId'];
      this.promotionAdminService.findById(promotionId).subscribe(res => {
        console.log(res);
        this.data = res;
        this.formEditPromotion.get('promotionId')?.setValue(this.data.promotionId);
        this.formEditPromotion.get('promotionName')?.setValue(this.data.promotionName);
        this.formEditPromotion.get('startTime')?.setValue(this.data.startTime);
        this.formEditPromotion.get('endTime')?.setValue(this.data.endTime);
        this.formEditPromotion.get('applyDay')?.setValue(this.data.applyDay);
        this.formEditPromotion.get('quantity')?.setValue(this.data.quantity);
        this.formEditPromotion.get('maxDiscount')?.setValue(this.data.maxDiscount);
        this.formEditPromotion.get('remainApply')?.setValue(this.data.remainApply);
        this.formEditPromotion.get('status')?.setValue(this.data.status);
        this.formEditPromotion.get('code')?.setValue(this.data.code);
      });
    }

    editPromotion(){
      this.promotionAdminService.edit(this.data.promotionId, this.formEditPromotion.value).subscribe(res=>{
        this.router.navigateByUrl('/admin/listPromotions')
      })
    }

}
