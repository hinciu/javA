package patterns.structural.compositepattern;

public class Main {
    public static void main(String[] args) {
       Shape s = new Circle();
       Composite c = new Composite();
       Composite c2 = new Composite();
       c.add(new Circle());
        c.add(s);
        c.add(c2);
        c.draw();
    }
}
