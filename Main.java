package PACKAGE_NAME;


import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws ProductsAlreadyExistsExeption {
        Product bread = new Product("хлеб", 40, 0.5, true);
        Product butter = new Product("сливочное масло", 120, 0.18, true);
        Product cheese = new Product("сыр", 150, 0.2, true);
        Product milk = new Product("молоко", 50, 0.9, true);
        Product apples = new Product("яблоки", 100, 1.0, true);
        Product bananas = new Product("бананы", 110, 1.5, true);
        Product bananas2 = new Product("бананы", 112, 1.4, true);

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


        Recipe recipe1 = new Recipe ("Рецепт №1", (Set<Product>) productsList1);
        Recipe recipe2 = new Recipe ("Рецепт №2", (Set<Product>) productsList2);


        recipe1.totalSumOfPrices((Set<Product>) productsList2);

        RecipesList recipes = new RecipesList();
        recipes.addRecipeList(recipe1);
        recipes.addRecipeList(recipe2);
        System.out.println(recipes);

        }
    }


