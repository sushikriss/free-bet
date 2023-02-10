import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class WidthChangeService {
  private toggleSource = new BehaviorSubject<boolean>(false);
  currentToggle = this.toggleSource.asObservable();

  constructor() {}

  changeWidth(toggle: boolean) {
    this.toggleSource.next(toggle);
  }
}
