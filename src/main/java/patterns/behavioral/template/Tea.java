package patterns.behavioral.template;

public class Tea extends BeverageTemplate {
    @Override
    void brew() {
        System.out.println("tea bag");
    }

    @Override
    void addCondiments() {
        System.out.println("add lemon");
    }
//    public void prepare() {
//
//    }
//
//    public void boilWater() {
//        System.out.println("Boiling water");
//    }
//
//    public void steepTeaBag() {
//        System.out.println("steepTeaBag");
//    }
//
//    public void pourInCup() {
//        System.out.println("pour");
//    }
//
//    public void addLemon() {
//        System.out.println("addLemon");
//    }
//}
}
