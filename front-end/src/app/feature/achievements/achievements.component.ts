import { Component, OnInit, OnDestroy } from '@angular/core';
import { WidthChangeService } from 'src/app/shared/services/width-change.service';

@Component({
  selector: 'app-achievements',
  templateUrl: './achievements.component.html',
  styleUrls: ['./achievements.component.scss']
})
export class AchievementsComponent implements OnInit, OnDestroy {
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
