import { Component, OnInit } from '@angular/core';
import { LazyLoadScriptService } from '../../adminServices/lazy-load-script.service';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  constructor(private lazyLoad: LazyLoadScriptService) { }

  ngOnInit(): void {
    this.lazyLoad.loadScript('assets/dist/js/adminlte.min.js').subscribe(_ => {
      console.log('Jquery is loaded!')
    });
  }

}
