package patterns.structural.bridge;

public class RedColor implements Colorr {
    @Override
    public void applyColor() {
        System.out.println("Red");
    }
}
