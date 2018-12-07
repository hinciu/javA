package patterns.creational.factory.abstract_factory;

import patterns.creational.factory.factory_method.Product;

public class ProductFactory {
    public static Product createProduct(ProductAbstractFactory productAbstractFactory) {
        return productAbstractFactory.createProduct();
    }
}
