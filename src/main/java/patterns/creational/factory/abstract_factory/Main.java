package patterns.creational.factory.abstract_factory;

import patterns.creational.factory.factory_method.Product;

public class Main {
    public static void main(String[] args) {
        Product productA = ProductFactory.createProduct(new ProductAFactory());
        Product productB = ProductFactory.createProduct(new ProductBFactory());
    }
}
