import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CategoryAdminService } from '../../adminServices/category-admin.service';

@Component({
  selector: 'app-edit-category',
  templateUrl: './edit-category.component.html',
  styleUrls: ['./edit-category.component.css']
})
export class EditCategoryComponent implements OnInit {

  formEditCategory = this.fb.group({
    categoryId: [''],
    categoryName: ['', Validators.required],
    status: ['', Validators.required],
  });

  submitted = false;

  constructor(private categoryAdminService: CategoryAdminService,
    private route: ActivatedRoute,
    private fb: FormBuilder,
    private router: Router,
    private http: HttpClient) { }

    data:any = null;
    ngOnInit(): void {
      let categoryId = this.route.snapshot.params['categoryId'];
      this.categoryAdminService.findById(categoryId).subscribe(res => {
        this.data = res;
        console.log(this.data);
        this.formEditCategory.get('categoryId')?.setValue(this.data.categoryId);
        this.formEditCategory.get('categoryName')?.setValue(this.data.categoryName);
        this.formEditCategory.get('status')?.setValue(this.data.status);
      });
    }

    editCategory(){
      this.categoryAdminService.edit(this.data.categoryId, this.formEditCategory.value).subscribe(res=>{
        this.router.navigateByUrl('/admin/listCategories')
      })
    }

}
