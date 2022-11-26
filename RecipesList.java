package PACKAGE_NAME;

import java.util.HashSet;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipesList that = (RecipesList) o;
        return Objects.equals(recipes, that.recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipes);
    }

    @Override
    public String toString() {
        return "Список рецептов: " + recipes;
    }
}
