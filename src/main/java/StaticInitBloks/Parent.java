package StaticInitBloks;

/**
 * Created by sberber on 8/7/2017.
 */
public class Parent {


    static {
        System.out.println("Static parent");
    }
    Parent() {
        System.out.println("parent constructor");
    }
    {
        System.out.println("Block parent");
    }


}
