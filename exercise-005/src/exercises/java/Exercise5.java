package exercises.java;

import java.util.Random;
import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int sum = 0;
        Random rand = new Random();

        DataObject[] arr = new DataObject[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = new DataObject();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i].count = rand.nextInt(200);
            System.out.println(arr[i].count);
            if(i < 2) {
                arr[i].code = "friday";
                System.out.println(arr[i].code);
            } else {
                arr[i].code = "saturday";
                System.out.println(arr[i].code);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].code.equals("friday")) {
                sum += arr[i].count;
            }
        }
        System.out.println(sum);
    }
}
