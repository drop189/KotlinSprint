package org.example.lesson_11

class RecipeCategory(
    recipes: List<Recipe>,
)

class Recipe(
    nameOfRecipe: String,
    textOfRecipe: String,
    quantityOfPortion: Int,
    ingredients: List<Ingredient>,
    isFavorite: Boolean = false,
)

class Ingredient(
    nameOfIngredient: String,
    measurementMethod: String,
    quantityOfIngredient: Int,
)