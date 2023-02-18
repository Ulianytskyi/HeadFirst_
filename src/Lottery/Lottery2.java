package Lottery;

import java.util.ArrayList;
import java.util.Collections;

public class Lottery2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int x = (int) (Math.random() * 52 + 1);
            arr.add(x);
        }

        Collections.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}

