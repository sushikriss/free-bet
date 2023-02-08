import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './core/register/register.component';
import { AboutComponent } from './feature/about/about.component';
import { AchievementsComponent } from './feature/achievements/achievements.component';
import { DailyComponent } from './feature/daily/daily.component';
import { HomeComponent } from './feature/home/home.component';
import { RefferalsComponent } from './feature/refferals/refferals.component';
import { ShopComponent } from './feature/shop/shop.component';
import { TokensComponent } from './feature/tokens/tokens.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent },

  // Feature Modules
  { path: 'about', component: AboutComponent },
  { path: 'referral', component: RefferalsComponent },
  { path: 'tokens', component: TokensComponent },
  { path: 'daily', component: DailyComponent },
  { path: 'shop', component: ShopComponent },
  { path: 'achievements', component: AchievementsComponent },
  { path: 'register', component: RegisterComponent },

  // Rest
  { path: '**', component: HomeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
