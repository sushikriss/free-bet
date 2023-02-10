import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Token } from '../fragments/user-interface';

@Injectable({
  providedIn: 'root',
})
export class TokenApiService {
  constructor(private http: HttpClient) {}

  async getCryptoData() {
    const sub = this.http.get<Token>('http://localhost:8080/api/tokens');
    return await firstValueFrom(sub);
  }
}
