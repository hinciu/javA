package patterns.structural.bridge;

//Мост — это структурный паттерн, который разделяет бизнес-логику или большой класс на несколько отдельных иерархий, которые потом можно развивать отдельно друг от друга.

//Одна из этих иерархий (абстракция) Shape получит ссылку на объекты другой иерархии (реализация) Color и будет делегировать им основную работу.
//        Благодаря тому, что все реализации будут следовать общему интерфейсу, их можно будет взаимозаменять внутри абстракции.
public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(new Black());
        Shape c2 = new Circle(new RedColor());
        c.getFigure();
        c2.getFigure();
    }
}
