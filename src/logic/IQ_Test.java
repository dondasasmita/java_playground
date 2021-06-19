package logic;

import java.util.ArrayList;

/**
 * Bob is preparing to pass IQ test. The most frequent task in this test is to find out which one of the given numbers differs from the others.
 * Bob observed that one number usually differs from the others in evenness.
 * Help Bob — to check his answers, he needs a program that among the given numbers finds one that is different in evenness, and return a position of this number.
 *
 * iqTest("2 4 7 8 10") => 3 // Third number is odd, while the rest of the numbers are even
 *
 * iqTest("1 2 1 1") => 2 // Second number is even, while the rest of the numbers are odd
 *
 * source : https://www.codewars.com/kata/552c028c030765286c00007d/train/javascript
 */

public class IQ_Test {
    public static void main(String[] args) {
        int oddOneOut1 = iqTest("2 4 7 8 10");
        int oddOneOut2 = iqTest("1 2 1 1");
        System.out.println(oddOneOut1);
        System.out.println(oddOneOut2);

    }

    private static int iqTest(String nums) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        ArrayList<Integer> oddNumbers = new ArrayList<>();

        String[] numStringArray = nums.split(" ");

        for (String num : numStringArray) {
            int number = Integer.parseInt(num);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        if (evenNumbers.size() > 1) {
            return oddNumbers.get(0);
        }

        return evenNumbers.get(0);
    }
}
