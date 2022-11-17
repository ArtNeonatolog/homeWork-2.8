package PACKAGE_NAME;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Recipe<T extends Products> {
    private final String name;

    private final Set<Products> listOfProduct;

    private T product;

    private Integer sum = 0;

    public Recipe(String name, Set<Products> listOfProduct) {
        this.name = name;
        this.listOfProduct = listOfProduct;
    }

    public int totalSumOfPrices() {
        for (Products product : listOfProduct) {
            sum += product.getPrice();
        }
        return sum;
    }

    public Integer getSum() {
        return sum;
    }

    public T getProduct() {
        return product;
    }

    public String getName() {
        return name;
    }

    public Set<Products> getListOfProduct() {
        return listOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe<?> recipe = (Recipe<?>) o;
        return Objects.equals(name, recipe.name) && Objects.equals(listOfProduct, recipe.listOfProduct) && Objects.equals(product, recipe.product) && Objects.equals(sum, recipe.sum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, listOfProduct, product, sum);
    }

    @Override
    public String toString() {
        return
                "имя рецепта - " + name +
                ", набор продуктов - " + listOfProduct +
                ", общая стоимость продуктов - " + totalSumOfPrices() + " рублей";
    }
}
