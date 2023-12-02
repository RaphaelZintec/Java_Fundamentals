package Project1;

import java.util.Objects;

public class Product {
    //ATTRIBUTES
    private String name;
    private int productID;

    //CONSTRUCTOR
    public Product(String name, int productID) {
        this.name = name;
        this.productID = productID;
    }

    //METHODS
    public String getName() {
        return name;
    }
    public int getProductID() {
        return productID;
    }

    @Override
    /*public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getProductID() == product.getProductID();
    }*/
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o; // Effectuer un moulage explicite
        return getProductID() == product.getProductID();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductID());
    }

    @Override
    public String toString() {
        return "#"+productID+" "+name;
    }
}
