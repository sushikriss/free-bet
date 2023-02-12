import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AchievementsComponent } from './achievements/achievements.component';
import { ChatComponent } from './chat/chat.component';
import { DailyComponent } from './daily/daily.component';
import { HomeComponent } from './home/home.component';

import { RefferalsComponent } from './refferals/refferals.component';
import { ShopComponent } from './shop/shop.component';
import { TokensComponent } from './tokens/tokens.component';

@NgModule({
  declarations: [
    HomeComponent,
    RefferalsComponent,
    DailyComponent,
    ShopComponent,
    AchievementsComponent,
    AboutComponent,
    ChatComponent,
    TokensComponent,
  ],
  imports: [CommonModule, RouterModule],
  exports: [
    HomeComponent,
    RefferalsComponent,
    DailyComponent,
    ShopComponent,
    AchievementsComponent,
    AboutComponent,
    ChatComponent,
    TokensComponent,
  ],
})
export class FeatureModule {}
