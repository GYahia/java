import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  public host : string="http://localhost:8080"

  constructor(private httpClient: HttpClient) { }

  connexionUser(url, data) {
    return this.httpClient.post(url,data);
  }




}
