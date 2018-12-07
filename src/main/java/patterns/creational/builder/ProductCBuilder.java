package patterns.creational.builder;

public class ProductCBuilder {
    private String name;
    private String weight;
    private String color;
    private String dimension;
    private String price;

    public ProductCBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductCBuilder setWeight(String weight) {
        this.weight = weight;
        return this;
    }

    public ProductCBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public ProductCBuilder setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }

    public ProductCBuilder setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getName() {
        return name;
    }

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

    public ProductC build(){
        return new ProductC(this);
    }
}
