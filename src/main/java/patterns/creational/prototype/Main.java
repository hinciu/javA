package patterns.creational.prototype;

// Когда создание объекта забирает много ресурсов (обращение в базу.) первый раз обращаемся в базу. второй раз происходит клонирование уже сужествующего объекта
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Book b = new Book("book.txt");
        Book b2 = (Book) b.clone();
        b.clear();
        System.out.println(b.getContent());

        System.out.println(b2.getContent());
    }
}
