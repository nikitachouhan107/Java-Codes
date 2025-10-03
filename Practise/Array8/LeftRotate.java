package Practise.Array8;
//Rotate an array k times (left rotation or right rotation).

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 1; // rotate left 1 times
        int n = arr.length;

        k = k % n; // handle if k > n

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[i] = arr[(i + k) % n];
        }

        System.out.print("Left Rotated Array: ");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}

