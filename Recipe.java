package PACKAGE_NAME;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Recipe {
    private final String name;

    private Set<Product> products = new HashSet<>();

    public Recipe(String name, Set<Product> products) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (products == null || !name.isEmpty() || !name.isBlank()) {
            this.products = products;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public double totalSumOfPrices(Set<Product> products) {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return
                "Название рецета - " + name +
                ", набор продуктов: " + products +
                        ", стоимость продуктов - " + totalSumOfPrices(products) + " рублей.";
    }
}
