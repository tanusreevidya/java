import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class UploadService {

  httpUrl = environment.host + `stock-price-service/stockprice/`

  constructor(private httpClient: HttpClient) { }

   uploadStocksSheet(formData: FormData): Observable<object>{
     return this.httpClient.post<object>(this.httpUrl+"uploadStocksSheet",formData);
   }

  //  getAllStockPrices():Observable<StockPrice[]>{
  //    return 
  //  }

}
