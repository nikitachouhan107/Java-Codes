package Practise.String7;
//Convert the first letter of every word in a string to uppercase.

public class UpperCase {
    public static void main(String[] args) {
        String str = "hello world from java";
        String words[] = str.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }

        System.out.println(result.trim());
    }
}
