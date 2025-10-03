package Practise.Operator5;
//Increment a variable by 1 without using ++ or +. (hint: bitwise operators).

public class Increment{
    public static void main(String[] args) {
        int num = 7;
        num = addOne(num);
        System.out.println("Incremented value: " + num);
    }

    public static int addOne(int n) {
        int m = 1; // the value we want to add
        while (m != 0) {
            int carry = n & m;   // carry where both bits are 1
            n = n ^ m;           // sum without carry
            m = carry << 1;      // shift carry left for next position
        }
        return n;
    }
}

