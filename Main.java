package PACKAGE_NAME;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Products bread = new Products("хлеб", 40, 0.5, true);
        Products butter = new Products("сливочное масло", 120, 0.18, true);
        Products cheese = new Products("сыр", 150, 0.2, true);
        Products milk = new Products("молоко", 50, 0.9, true);
        Products apples = new Products("яблоки", 100, 1.0, true);
        Products apples2 = new Products("яблоки", 100, 1.0, true);

        Set<Products> listOfProducts = new HashSet<Products>();
        listOfProducts.add(bread);
        listOfProducts.add(butter);
        listOfProducts.add(milk);
        listOfProducts.add(cheese);
        listOfProducts.add(apples);
        listOfProducts.remove(bread);

        for (Products listOfProduct : listOfProducts) {
                System.out.println(listOfProduct);
            }
        }
    }


