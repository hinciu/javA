package patterns.creational.factory.factory_method;

import patterns.creational.factory.factory_method.impl.Factory;
import patterns.creational.factory.factory_method.impl.ProductACreator;

public class Main {
    public static void main(String[] args) {
        ProductCreator productCreator = new ProductACreator();
        productCreator.getProduct();

        Factory factory = new Factory();
        factory.getProduct("A");
    }
}
