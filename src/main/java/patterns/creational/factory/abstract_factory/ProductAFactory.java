package patterns.creational.factory.abstract_factory;

import patterns.creational.factory.factory_method.Product;
import patterns.creational.factory.factory_method.impl.ProductA;

public class ProductAFactory implements ProductAbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
