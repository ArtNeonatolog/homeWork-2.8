package PACKAGE_NAME;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Products bread = new Products("хлеб", 40, 0.5, true);
        Products butter = new Products("сливочное масло", 120, 0.18, true);
        Products cheese = new Products("сыр", 150, 0.2, true);
        Products milk = new Products("молоко", 50, 0.9, true);
        Products apples = new Products("яблоки", 100, 1.0, true);
        Products bananas = new Products("бананы", 110, 1.5, true);
        Products bananas2 = new Products("бананы", 112, 1.4, true);

        Set<Products> listOfProducts1 = new HashSet<>();
        listOfProducts1.add(bread);
        listOfProducts1.add(butter);
        listOfProducts1.add(milk);

        for (Products listOfProduct : listOfProducts1) {
                System.out.println(listOfProduct);
            }
        System.out.println();

        Set<Products> listOfProducts2 = new HashSet<>();
        listOfProducts2.add(cheese);
        listOfProducts2.add(apples);
        listOfProducts2.add(bananas);
        listOfProducts2.add(bananas2);
        for (Products listOfProduct : listOfProducts2) {
            System.out.println(listOfProduct);
        }
        System.out.println();

        Recipe<Products> recipe1 = new Recipe<>("Рецепт", listOfProducts1);
        Recipe<Products> recipe2 = new Recipe<>("Рецепт", listOfProducts2);

        Set<Recipe<Products>> recipes = new HashSet<>();
        recipes.add(recipe1);
        recipes.add(recipe2);
        for (Recipe<Products> recipe : recipes) {
            System.out.println(recipe);
        }

        }
    }


