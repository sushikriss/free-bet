import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { User } from '../../shared/fragments/user-interface';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit {
  user: User | undefined;

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.http.get<User>('http://localhost:8080/api/users').subscribe((data) => {
      this.user = data;
    });
  }
}
