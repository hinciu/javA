package patterns.structural.bridge;

public class Black implements Colorr {
    @Override
    public void applyColor() {
        System.out.println("black");
    }
}
