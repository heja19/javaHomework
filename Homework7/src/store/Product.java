package store;

import java.util.Objects;

public class Product {
    private String name;
    private Integer size;

    public Product(String name, Integer size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return size == product.size &&
                Objects.equals(name, product.name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}//end of Product