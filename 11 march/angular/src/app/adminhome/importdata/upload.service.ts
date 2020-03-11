import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UploadService {

  httpUrl = "http://localhost:8005/stockprice/"

  constructor(private httpClient: HttpClient) { }

   uploadStocksSheet(formData: FormData): Observable<object>{
     return this.httpClient.post<object>(this.httpUrl+"uploadStocksSheet",formData);
   }

  //  getAllStockPrices():Observable<StockPrice[]>{
  //    return 
  //  }

}
