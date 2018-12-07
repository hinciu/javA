package patterns.structural.decorator;

import patterns.structural.decorator.impl.FileReaderDecorator;
import patterns.structural.decorator.impl.HddFileReader;
import patterns.structural.decorator.impl.HddFileReaderPlusEncrypt;
import patterns.structural.decorator.impl.HddFileReaderPlusZip;
//Decorator design pattern is used to modify the functionality of an object at
//        runtime. At the same time other instances of the same class will not be
//        affected by this, so individual object gets the modified behavior.
//Декоратор — это структурный паттерн проектирования, который позволяет динамически добавлять объектам новую функциональность, оборачивая их в полезные «обёртки».
public class Main {
    public static void main(String[] args) {
        FileReaderComponent f1 = new HddFileReaderPlusEncrypt(new HddFileReaderPlusZip(new HddFileReader("file")));
        FileReaderComponent f2 = new HddFileReaderPlusZip(new HddFileReader("file"));
        FileReaderComponent f3 = new HddFileReader("file");
        System.out.println(f1.readFile());
        System.out.println(f2.readFile());
        System.out.println(f3.readFile());
    }
}
