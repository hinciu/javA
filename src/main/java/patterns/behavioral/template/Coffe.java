package patterns.behavioral.template;

public class Coffe extends BeverageTemplate {
    @Override
    void brew() {
        System.out.println("breew");
    }

    @Override
    void addCondiments() {
        System.out.println("add sugar and milk");
    }

//    public void prepare() {
//        boilWater();
//        brewCoffeeGrings();
//        pourInCup();
//        addSugarAndMilk();
//    }


//
//    public void brewCoffeeGrings() {
//        System.out.println("breew");
//    }
//
//
//    public void addSugarAndMilk() {
//        System.out.println("pour");
//    }
}
