package Practise.String8;

class Frequency {
    public static void main(String[] args) {
        String str = "hello world";

        int[] freq = new int[256]; // for all ASCII characters

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " -> " + freq[i]);
            }
        }
    }
}

