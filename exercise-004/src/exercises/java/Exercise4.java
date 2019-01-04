package exercises.java;

public class Exercise4 {
    public static void main(String[] args) {
        int sum = 0;

        DataObject[] arr = new DataObject[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = new DataObject();
        }

        arr[0].count = 5;
        arr[1].count = 10;
        arr[2].count = 15;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].count;
        }

        System.out.println(sum);
    }
}
