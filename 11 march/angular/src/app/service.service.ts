import { Injectable, Inject } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../app/models/users'
@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  httpUrl = 'http://localhost:8000/register/';
   users =User;
  constructor(@Inject (HttpClient) private httpClient) { }
 
  LoggedIn(){
    let user_id = localStorage.getItem('userId');
    if(user_id==null){
      return false;
    }else{
      return true;
    }
  }

  isActivated(user:User)
  {
    if(user.active == true){
      return true;
    }
  }

   isAdmin(){
     if (sessionStorage.getItem("userType")=="admin"){
       return true;
     }else {
       return false;
     }
   }

  getAllUsers(){
    return this.httpClient.get(this.httpUrl);
  }

  saveUser(user : User){
    return this.httpClient.post(this.httpUrl , user);
  }
  deleteUser(id: number): Observable<User>{
    return this.httpClient.delete(`http://localhost:8000/register/${id}`);
  }
  updateUserInfo(user : User): Observable<User>{
    return this.httpClient.put(this.httpUrl,user);
   }
   getUserById(id:number): Observable<User>{
     console.log("id:::service "+id);
     return this.httpClient.get(`http://localhost:8000/register/${id}`);
   }
  //  reg(){
  //    return this.ht.get(`http://localhost:8000/reg`);
  //  }
   serviceActivation(obj){
     return this.httpClient.put(`http://localhost:8000/activate`,obj)
   }

}
