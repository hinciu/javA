package patterns.structural.bridge;

public abstract class Shape {

    Colorr colorr;


    public Shape(Colorr colorr) {
        this.colorr = colorr;
    }

    public abstract void getFigure();
}
