import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { NavigationComponent } from './navigation/navigation.component';
import { RegisterComponent } from './register/register.component';

@NgModule({
  declarations: [NavigationComponent, FooterComponent, RegisterComponent],
  imports: [CommonModule, RouterModule],
  exports: [NavigationComponent, FooterComponent, RegisterComponent],
})
export class CoreModule {}
