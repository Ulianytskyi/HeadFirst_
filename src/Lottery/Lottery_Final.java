package Lottery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Lottery_Final {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (arr.size() < 6) {
            int x = (int) (Math.random() * 52 + 1);
            arr.add(x);
            arr = (ArrayList<Integer>) arr.stream().distinct().collect(Collectors.toList());
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
