package Practise.Array7;
//Find the missing number in an array of 1 to N.

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = arr.length + 1;    //  one number is missing

        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        int missing = totalSum - arrSum;
        System.out.println("Missing Number: " + missing);
    }
}

