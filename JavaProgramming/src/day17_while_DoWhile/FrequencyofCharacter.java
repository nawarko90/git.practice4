package day17_while_DoWhile;

public class FrequencyofCharacter {
    public static void main(String[] args) {
        String str = "AAABBBC";
        char ch = 'A';

        int frequency = 0;
        for (int i = 0; i < str.length(); i++) { // i: indexes of str
            char eachChar = str.charAt(i); // eachChar: each character of str
            if (ch == eachChar) { // if giving char is matching with eachChar, then ch is appeared in the string
                frequency++;
                // or frequency +=1;

            }

        }
        System.out.println(frequency); // always print after the loop

    }
}
