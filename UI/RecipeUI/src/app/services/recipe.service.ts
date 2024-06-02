import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Recipe } from '../interfaces/recipe';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RecipeService {

  constructor(
    private http: HttpClient,
  ) { }

  fetchTestEndpoint() {
    let url = "http://localhost:8080/test";
    return this.http.get<Recipe>(url);
  }

  fetchAllRecipes(): Observable<Recipe[]> {
    let url = "http://localhost:8080/getAllRecipes";
    return this.http.get<Recipe[]>(url);
  }
}
