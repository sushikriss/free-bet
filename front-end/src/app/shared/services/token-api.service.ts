import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Token } from '../fragments/user-interface';

@Injectable({
  providedIn: 'root',
})
export class TokenApiService {
  constructor(private http: HttpClient) {}

  async getCryptoData(): Promise<Token[]> {
    const sub = this.http.get<Token>('http://localhost:8080/api/tokens');
    const tokensArray = Object.values(await firstValueFrom(sub));
    tokensArray.map((token) => {
      const name = token.name.toLowerCase();
      token.image = `./assets/icons/${name}.png`;
    });
    return tokensArray;
  }
}
