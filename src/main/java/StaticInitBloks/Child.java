package StaticInitBloks;

/**
 * Created by sberber on 8/9/2017.
 */
public class Child extends Parent {
    static {
        System.out.println("static child ");
    }


    Child(){
        System.out.println("child constr");
    }

    {
        System.out.println("Block child init");
    }
}
