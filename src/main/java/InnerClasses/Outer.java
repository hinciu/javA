package InnerClasses;

/**
 * Created by sberber on 8/10/2017.
 */
public class Outer {
    private int a = 100;

     static class Inner{
        public void printMsg(){
            System.out.println("This is inner class");
        }
    }
    public void displayInner(){
        Inner in = new Inner();
        in.printMsg();
    }
}
