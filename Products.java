package PACKAGE_NAME;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Products {
    private String name;
    private Integer price;
    private Double amountKg;
    private final Boolean bought;

    public Products(String name, Integer price, Double amountKg, Boolean bought) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
           throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (price != null) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (amountKg != null) {
            this.amountKg = amountKg;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
            this.bought = true;
    }

    public Boolean getBought() {
        return bought;
    }

    public String getName() {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            return name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public Integer getPrice() {
        if (price != null) {
            return price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public Double getAmountKg() {
        if (amountKg != null) {
            return amountKg;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public void setPrice(Integer price) {
        if (price != null) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public void setAmountKg(Double amountKg) {
        if (amountKg != null) {
            this.amountKg = amountKg;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        if (name.equals(products.name) && price.equals(products.price) && amountKg.equals(products.amountKg) && bought.equals(products.bought)) {
            throw new RuntimeException("Такой продукт в списке уже есть!");
        }else {
            return products.bought;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, amountKg, bought);
    }

    @Override
    public String toString() {
        return
                "название продукта - " + name +
                ", цена - " + price +
                " рублей, вес - " + amountKg +
                " кг, продукт куплен - " + bought;
    }
}
