package Lottery;

import java.util.Arrays;

public class Lottery4 {
    public static void main(String[] args) {

        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {
            int x = (int) (Math.random() * 52 + 1);
            System.out.print(x + " ");
            for (int j = 0; j < 6; j++) {
                if (numbers[j] != x) {
                    numbers[i] = x;
                }
            }
        }

        Arrays.sort(numbers);
        System.out.println(" ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }
}

