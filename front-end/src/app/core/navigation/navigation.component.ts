import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.scss'],
})
export class NavigationComponent implements OnInit {
  showLogin: boolean = false;
  boxStyles = {
    transform: 'translate(0px, 150px)',
    opacity: 0,
  };
  toggle = false;

  toggleStyles() {
    this.toggle = !this.toggle;
    this.boxStyles = this.toggle
      ? {
          transform: 'translate(0px, 0px)',
          opacity: 1,
        }
      : {
          transform: 'translate(0px, 150px)',
          opacity: 0,
        };
  }

  constructor() {}

  ngOnInit(): void {}
}
