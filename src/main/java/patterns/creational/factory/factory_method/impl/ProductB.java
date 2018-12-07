package patterns.creational.factory.factory_method.impl;

import patterns.creational.factory.factory_method.Product;

public class ProductB implements Product {
    @Override
    public String getName() {
        return "product B";
    }

    @Override
    public String getWeight() {
        return "20 kg";
    }
}
