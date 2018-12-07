package patterns.structural.flyweight;

import java.awt.*;

public class Tree {
    private  int x;
    private int y;
//    общее состояние для объектов типа Tree. Создается через TreeFactory
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    public void draw(Graphics g){
        type.draw(g,x,y);
    }
}
