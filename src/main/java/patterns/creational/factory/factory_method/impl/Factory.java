package patterns.creational.factory.factory_method.impl;

import patterns.creational.factory.factory_method.Product;
import patterns.creational.factory.factory_method.ProductCreator;
//Simple Factory Pattern
public class Factory implements ProductCreator {
    @Override
    public Product getProduct() {
        return null;
    }

    public Product getProduct(String type) {
        Product product = null;

        switch (type) {
            case "A":
                product = new ProductA();
                break;
            case "B":
                product = new ProductB();
                break;
        }

        return product;
    }
}
