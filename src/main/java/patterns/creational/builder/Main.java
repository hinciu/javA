package patterns.creational.builder;

import patterns.creational.factory.factory_method.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new ProductC.ProductBuilder("name", "weigh")
                .setColor("color")
                .setDimension("dim")
                .setPrice("price")
                .build();

        Product product1 = new ProductCBuilder()
                .setColor("")
                .setDimension("")
                .setPrice("")
                .build();
    }
}
