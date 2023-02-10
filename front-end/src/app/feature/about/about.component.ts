import { Component, OnInit, OnDestroy } from '@angular/core';
import { WidthChangeService } from 'src/app/shared/services/width-change.service';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.scss'],
})
export class AboutComponent implements OnInit, OnDestroy {
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
