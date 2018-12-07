package patterns.structural.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {
    private List<Shape> components = new ArrayList<>();


    public void add(Shape c){
        components.add(c);
    }

    @Override
    public void draw() {
        for (Shape s : components){
            s.draw();
        }
    }
}
