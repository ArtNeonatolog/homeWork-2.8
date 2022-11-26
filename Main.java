package PACKAGE_NAME;


import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws ProductsAlreadyExistsExeption {
        Product bread = new Product("хлеб", 80, false);
        Product butter = new Product("сливочное масло", 700, false);
        Product cheese = new Product("сыр", 800, false);
        Product milk = new Product("молоко", 60, false);
        Product apples = new Product("яблоки", 90, false);
        Product bananas = new Product("бананы", 80, false);
        Product peanut = new Product("орехи", 600, false);

        ProductsList productsList1 = new ProductsList();
        ProductsList productsList2 = new ProductsList();

        productsList1.addProduct(bread);
        productsList1.addProduct(butter);
        productsList1.addProduct(cheese);
        System.out.println(productsList1);
        System.out.println();

        productsList2.addProduct(bananas);
        productsList2.addProduct(milk);
        productsList2.addProduct(apples);
        System.out.println(productsList2);
        System.out.println();

      productsList2.removeProduct("молоко");
        System.out.println(productsList2);


        Recipe recipe1 = new Recipe ("Рецепт №1");
        Recipe recipe2 = new Recipe ("Рецепт №2");

        recipe1.addProduct(bread, 0.5);
        recipe1.addProduct(milk,1.0);
        recipe1.addProduct(bananas, 2.0);

        recipe2.addProduct(cheese, 1.0);
        recipe2.addProduct(butter, 0.5);
        recipe2.addProduct(peanut, 0.3);

        System.out.println(recipe1);
        System.out.println(recipe2);

        RecipesList recipes = new RecipesList();
        recipes.addRecipeList(recipe1);
        recipes.addRecipeList(recipe2);
        System.out.println(recipes);

        }
    }


