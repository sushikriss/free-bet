export interface User {
  fullName: string;
  email: string;
}

export interface Token {
  name: string;
  image: string;
  current_price: number;
  market_cap: number;
  high_24h: number;
  low_24h: number;
  price_change_24h: number;
}
