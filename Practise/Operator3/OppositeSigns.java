package Practise.Operator3;
//Write a program to check if two numbers have opposite signs using bitwise operator.

public class OppositeSigns {
    public static void main(String[] args) {
        int a = 10;
        int b = -5;

        if ((a ^ b) < 0) {
            System.out.println(a + " and " + b + " have opposite signs");
        } else {
            System.out.println(a + " and " + b + " have the same sign");
        }
    }
}

