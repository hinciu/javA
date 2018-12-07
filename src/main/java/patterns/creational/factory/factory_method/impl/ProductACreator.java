package patterns.creational.factory.factory_method.impl;

import patterns.creational.factory.factory_method.Product;
import patterns.creational.factory.factory_method.ProductCreator;

public class ProductACreator implements ProductCreator{
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
