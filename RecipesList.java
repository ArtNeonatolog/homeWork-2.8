package PACKAGE_NAME;

import java.util.HashSet;
import java.util.Set;

public class RecipesList {

    private final Set<Recipe> recipes = new HashSet<>();

    public void addRecipeList(Recipe recipe)  {
        if (recipe == null) {
            return;
        }
        if (this.recipes.contains(recipe)) {
            throw new IllegalArgumentException("Такой рецепт уже существует!");
        }else {
            this.recipes.add(recipe);
        }
    }
}
