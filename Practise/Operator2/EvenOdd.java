package Practise.Operator2;
//Check if a number is even or odd using bitwise operator.

class EvenOdd{
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 4;

        if ((num1 & 1) == 0) {
            System.out.println(num1 + " is even");
        } else {
            System.out.println(num1 + " is odd");
        }
        if ((num2 & 1) == 0) {
            System.out.println(num2 + " is even");
        } else {
            System.out.println(num2 + " is odd");
        }
    }
}

