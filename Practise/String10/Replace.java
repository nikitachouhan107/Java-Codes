package Practise.String10;
//Replace all spaces in a string with - without using built-in replace().

public class Replace {
    public static String replaceSpaces(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') arr[i] = '-';
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "replace all spaces";
        System.out.println(replaceSpaces(input));
    }
}

