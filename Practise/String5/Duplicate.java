package Practise.String5;
//Remove all duplicate characters from a string.

public class Duplicate{
    public static void main(String[] args) {
        String str = "happy";
        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println("Without duplicates: " + result);
    }
}
