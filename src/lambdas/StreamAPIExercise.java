package lambdas;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamAPIExercise {
    public static void main(String[] args) {

        // 1.
        ArrayList<Integer> evenNums = new ArrayList<>();

        IntStream
                .range(1,100)
                .filter(num -> num % 2 == 0)
                .forEach(num -> evenNums.add(num));

        for (Integer num : evenNums) {
            System.out.println(num);
        }

    }
}
