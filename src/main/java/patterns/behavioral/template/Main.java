package patterns.behavioral.template;

public class Main {
    public static void main(String[] args) {
        BeverageTemplate tea = new Tea();
        BeverageTemplate coffe = new Coffe();

        tea.prepare();
        coffe.prepare();
    }
}
