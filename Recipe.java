package PACKAGE_NAME;

import java.util.*;


public class Recipe {
    private final String name;

    private Map<Product, Double> products = new HashMap<>();

    public Recipe(String name) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public void addProduct (Product product, double quantity) {
        if (quantity <= 0) {
            quantity = 1;
        }
        if(this.products.containsKey(product)) {
            this.products.put(product, this.products.get(product) + quantity);
        } else {
            this.products.put(product, quantity);
        }
    }
    public double totalSumOfPrices(Map<Product, Double> products) {
        double sum = 0;
        for (Map.Entry<Product, Double> product : this.products.entrySet()) {
            sum += product.getKey().getPrice() * product.getValue();
        }
        return sum;
    }

    public String getName() {
        return name;
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
                "Название рецепта - " + name +
                ", набор продуктов: " + products.keySet() + ", количество продукта - " + products.values() +
                        ", стоимость продуктов - " + totalSumOfPrices(products) + " рублей.";
    }
}
