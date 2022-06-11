import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CategoryAdminService } from '../../adminServices/category-admin.service';

@Component({
  selector: 'app-add-category',
  templateUrl: './add-category.component.html',
  styleUrls: ['./add-category.component.css']
})
export class AddCategoryComponent implements OnInit {

  formAddCategory = this.fb.group({
    categoryName: ['', Validators.required],
    status: ['', Validators.required],
  });
  submitted = false;
  constructor(private fb: FormBuilder,
    private route: ActivatedRoute,
     private categoryAdminService: CategoryAdminService,
     private router: Router,
     private http: HttpClient) {  }

  ngOnInit(): void {
    let id = this.route.snapshot.params['categoryId'];
    this.categoryAdminService.findById(id).subscribe(res => console.log(res));
  }
  addCategory(){
  this.categoryAdminService.add(this.formAddCategory.value).subscribe(res=>{
    this.router.navigateByUrl('/admin/listCategories')
  })
}

}
