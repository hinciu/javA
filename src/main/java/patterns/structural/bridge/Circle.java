package patterns.structural.bridge;

public class Circle extends Shape {

    public Circle(Colorr colorr) {
        super(colorr);
    }

    @Override
    public void getFigure() {
        System.out.println("Circle");
        colorr.applyColor();

    }
}
