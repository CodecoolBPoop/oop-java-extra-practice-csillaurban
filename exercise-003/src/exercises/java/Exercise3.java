package exercises.java;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 324, 56, -23};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
    }
}
