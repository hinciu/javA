package patterns.creational.builder;

import patterns.creational.factory.factory_method.Product;

public class ProductC implements Product {
    private String name;
    private String weight;
    private String color;
    private String dimension;
    private String price;

    public ProductC(ProductBuilder builder) {
        this.name = builder.name;
        this.weight = builder.weight;
        this.color = builder.color;
        this.dimension = builder.dimension;
        this.price = builder.price;
    }

    public ProductC(ProductCBuilder builder) {
        this.name = builder.getName();
        this.weight = builder.getWeight();
        this.color = builder.getColor();
        this.dimension = builder.getDimension();
        this.price = builder.getPrice();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getDimension() {
        return dimension;
    }

    public String getPrice() {
        return price;
    }

    public static class ProductBuilder {
        private String name;
        private String weight;
        private String color;
        private String dimension;
        private String price;

        public ProductBuilder(String name, String weight) {
            this.name = name;
            this.weight = weight;
        }

        public ProductBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public ProductBuilder setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }

        public ProductBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        public ProductC build() {
            return new ProductC(this);
        }
    }
}
