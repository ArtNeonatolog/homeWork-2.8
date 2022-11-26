package PACKAGE_NAME;

import java.util.Objects;

public class Product {
    private final String name;
    private final Integer price;
    private Boolean bought;

    public Product(String name, Integer price, Boolean bought) {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
            this.name = name;
        } else {
           throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (price != null) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
            this.bought = false;
    }

    public Boolean isBought() {

        return bought;
    }

    public String getName() {
        if (name != null || !name.isEmpty() || !name.isBlank()) {
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

    public void setBought() {
        this.bought = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isBought() ? "Да":"Нет";
        return
                "название продукта - " + name +
                ", цена - " + price +
                " рублей, продукт куплен - " + checkedString;
    }
}
