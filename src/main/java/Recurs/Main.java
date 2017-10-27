package Recurs;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sberber on 8/10/2017.
 */
public class Main {
    public static void main(String[] args) {

        //System.out.println(Fact(5));
//        int prev = 1;
//        int next = 1;
//        int rez;
//        for (int i = 0; i < 10; i++) {
//            //System.out.print(prev+" ");
//            //System.out.print(next+" ");
//            rez = prev + next;
//            System.out.print(rez + " ");
//            prev = next;
//            next = rez;
//        }
        System.out.println(fib(10));


    }

    public static int fib(int n) {
        if (n <= 1 ){
            return fib(1);
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

    public static int Fact(int num) {

        int rez;

        if (num == 0) {
            return 1;
        } else
            rez = num * Fact(num - 1);
        return rez;
    }
}

