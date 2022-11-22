package PACKAGE_NAME;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductsList  {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) throws ProductsAlreadyExistsExeption {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new ProductsAlreadyExistsExeption ();
        }else {
            this.products.add(product);
        }
    }

    public void checkProduct (String name) {
        for (Product product : this.products) {
            if (product.getName().equals(name)) {
                product.setBought();
                break;
            }
        }
    }

    public void removeProduct (String name) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getName().equals(name)) {
                productIterator.remove();
                break;
            }
        }
    }

    @Override
    public String toString() {
        return
                "Лист продуктов: " + products;
    }
}
