package lambada.Excersise.exeptions;

import java.util.function.BiConsumer;

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 0;

        process(arr, key, wrapperLambada((k, v) -> System.out.println(k / v)));
    }

    static void process(int[] arr, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : arr) {

            consumer.accept(i, key);

        }

    }

    private static BiConsumer<Integer, Integer> wrapperLambada(BiConsumer<Integer, Integer> consumer) {
        return (v,k)->{
            try {
                consumer.accept(v,k);
            }catch ( ArithmeticException e){
                System.out.println("ups");
            }

        };
    }


}
