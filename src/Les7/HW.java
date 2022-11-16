package Les7;

import java.util.Locale;

public class HW {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Hallo world", 'l'));
        spase();
        System.out.println(findWordPosition("Apollo", "pollo"));
        spase();
        System.out.println(stringReverse("String"));
        spase();
        System.out.println(isPalindrome("Ere"));




    }
    public static boolean isPalindrome(String str) {
        if (str==null){
            return false;
        }
        char[] cArr = str.toUpperCase(Locale.ROOT).toCharArray();

        for (int i = 0; i < cArr.length / 2; i++) {
            if (cArr[i] != cArr[cArr.length - i - 1]) {
                return false;
            }
        }


        return true;
    }


    public static String stringReverse(String str) {
        char cArr[] = str.toCharArray();
        String result = "";

        for (int i = 0; i < cArr.length; i++) {
            result = cArr[i] + result;
        }
        return result;
    }


    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }


    public static int findSymbolOccurance(String s, char c) {
        char chArr[] = s.toCharArray();
        int couunt = 0;
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == c)
                couunt++;
        }
        return couunt;
    }

    public static void spase() {
        System.out.println("-------------------");
    }
}
