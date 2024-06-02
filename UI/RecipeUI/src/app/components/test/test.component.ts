import { Component, OnInit } from '@angular/core';
import { Recipe } from 'src/app/interfaces/recipe';
import { RecipeService } from 'src/app/services/recipe.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.scss']
})
export class TestComponent implements OnInit {

  recipes: Recipe[];

  constructor(
    private recipeService: RecipeService
  ) { }

  ngOnInit(): void {
    this.recipeService.fetchAllRecipes().subscribe((result) => {
      this.recipes = result;
    })
  }

}
