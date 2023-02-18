package Lottery;

import java.util.ArrayList;
import java.util.Arrays;

public class Lottery1 {
    public static void main(String[] args) {

        boolean status = true;
        int[] numbers = new int[0];
        while (status) {
            numbers = new int[6];
            for (int i = 0; i < 6; i++) {

                int x = (int) (Math.random() * 52 + 1);
                numbers[i] = x;
            }
            Arrays.sort(numbers);

            ArrayList<Integer> arr_new = new ArrayList<>();
            for (int j = 0; j < numbers.length; j++) {
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[j] == i) {
                        arr_new.add(numbers[j]);
                    }
                }
            }

            if (arr_new.size() < 1) {

                System.out.println(arr_new);
                status = false;

            } else {
                System.out.println(arr_new);
            }
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }
}

