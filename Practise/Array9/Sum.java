package Practise.Array9;
//Find the sum of all elements in an array.

public class Sum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of array: " + sum);
    }
}

