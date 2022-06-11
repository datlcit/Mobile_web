import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { CategoryAdminService } from '../../adminServices/category-admin.service';
import { ProductAdminService } from '../../adminServices/product-admin.service';

@Component({
  selector: 'app-edit-product',
  templateUrl: './edit-product.component.html',
  styleUrls: ['./edit-product.component.css']
})
export class EditProductComponent implements OnInit {

  formEditProduct = this.fb.group({
    productId: [''],
    productName: ['', Validators.required],
    description: ['', Validators.required],
    productImage: ['', Validators.required],
    price: ['', Validators.required],
    ram: ['', Validators.required],
    storage: ['', Validators.required],
    color: ['', Validators.required],
    quantity: ['', Validators.required],
    status: ['', Validators.required],
    category: ['', Validators.required],
  });

  constructor(private categoryAdminService: CategoryAdminService,
    private productAdminService: ProductAdminService,
    private route: ActivatedRoute,
    private fb: FormBuilder,
    private router: Router,
    private http: HttpClient) { }

    data:any = null;
    ngOnInit(): void {
      this.loadCategories()
      let productId = this.route.snapshot.params['productId'];
      this.productAdminService.findById(productId).subscribe(res => {
        this.data = res;
        console.log(this.data);
        this.formEditProduct.get('productId')?.setValue(this.data.productId);
        this.formEditProduct.get('productName')?.setValue(this.data.productName);
        this.formEditProduct.get('description')?.setValue(this.data.description);
        this.formEditProduct.get('productImage')?.setValue(this.data.productImage);
        this.formEditProduct.get('price')?.setValue(this.data.price);
        this.formEditProduct.get('ram')?.setValue(this.data.ram);
        this.formEditProduct.get('storage')?.setValue(this.data.storage);
        this.formEditProduct.get('color')?.setValue(this.data.color);
        this.formEditProduct.get('quantity')?.setValue(this.data.quantity);
        this.formEditProduct.get('status')?.setValue(this.data.status);
        this.formEditProduct.get('category')?.setValue(this.data.category.categoryId);
      });
    }

    editProduct(){
      this.productAdminService.edit(this.data.productId, this.formEditProduct.value).subscribe(res=>{
        this.router.navigateByUrl('/admin/listProducts')
      })
    }

    // Hàm gọi danh sách category
    categories: Array<any> = [];
    loadCategories(){
      this.categoryAdminService.get().subscribe(res =>{
        this.categories = res;
        console.log(this.categories);
      })
    }

}
