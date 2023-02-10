import { Component, OnDestroy, OnInit } from '@angular/core';
import { WidthChangeService } from 'src/app/shared/services/width-change.service';

@Component({
  selector: 'app-shop',
  templateUrl: './shop.component.html',
  styleUrls: ['./shop.component.scss']
})
export class ShopComponent implements OnInit, OnDestroy {
  toChangeWidth: boolean = false;
  widthSubscription: any;
  constructor(private widthService: WidthChangeService) {}

  ngOnInit(): void {
    this.widthSubscription = this.widthService.currentToggle.subscribe(
      (value) => {
        this.toChangeWidth = value;
      }
    );
  }

  ngOnDestroy(): void {
    this.widthSubscription?.unsubscribe();
  }
}
