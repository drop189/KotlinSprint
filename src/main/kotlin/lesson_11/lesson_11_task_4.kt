package org.example.lesson_11

class RecipeCategory(
    recipe1: Recipe,
    recipe2: Recipe,
    recipe3: Recipe,
    recipe4: Recipe,
    recipe5: Recipe,
    recipe6: Recipe,
) {}

class Recipe(
    nameOfRecipe: String,
    textOfRecipe: String,
    quantityOfPortion: Int,
    ingredient1: Ingredient,
    ingredient2: Ingredient,
    ingredient3: Ingredient,
    ingredient4: Ingredient,
    ingredient5: Ingredient,
    ingredient6: Ingredient,
    ingredient7: Ingredient,
    ingredient8: Ingredient,
    ingredient9: Ingredient,
    isFavorite: Boolean = false,
) {}

class Ingredient(
    nameOfIngredient: String,
    measurementMethod: String,
    quantityOfIngredient: Int,
) {}