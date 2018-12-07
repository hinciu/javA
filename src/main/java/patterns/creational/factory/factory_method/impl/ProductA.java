package patterns.creational.factory.factory_method.impl;

import patterns.creational.factory.factory_method.Product;

public class ProductA implements Product {
    @Override
    public String getName() {
        return "product A";
    }

    @Override
    public String getWeight() {
        return "10 kg";
    }
}
