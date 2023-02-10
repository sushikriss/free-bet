import { Component, OnDestroy, OnInit } from '@angular/core';
import { TokenApiService } from 'src/app/shared/services/token-api.service';
import { WidthChangeService } from 'src/app/shared/services/width-change.service';
import { User } from '../../shared/fragments/user-interface';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit, OnDestroy {
  user: User | undefined;
  toChangeWidth: boolean = false;
  widthSubscription: any;
  loading: boolean = true;
  tokens: any;
  userAuthenticated: boolean = true;

  constructor(
    private widthService: WidthChangeService,
    private cryptoService: TokenApiService
  ) {}

  async ngOnInit() {
    this.widthSubscription = this.widthService.currentToggle.subscribe(
      (value) => {
        this.toChangeWidth = value;
      }
    );

    this.tokens = await this.cryptoService.getCryptoData();
    this.loading = false;
    window.scrollTo(0, 0);
  }

  ngOnDestroy(): void {
    this.widthSubscription?.unsubscribe();
  }
}
