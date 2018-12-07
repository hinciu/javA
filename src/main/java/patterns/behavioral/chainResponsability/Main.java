package patterns.behavioral.chainResponsability;
//Связать несколько объектов в цепочку и если первый объект не справился с запросом
//то передать в следующую цепочку
public class Main {
    public static void main(String[] args) {
        Notifier simple = new SimpleNot(1);
        Notifier urgent = new Urgent(2);


        simple.setNext(urgent);

//        simple.notify("debug",1);
        simple.notify("error", 2);
    }
}
