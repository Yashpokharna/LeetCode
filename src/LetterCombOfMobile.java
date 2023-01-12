import java.util.ArrayList;

public class LetterCombOfMobile {
    public static void main(String[] args) {
        System.out.println(padRet("", "12"));
//        System.out.println(padCount("", "12"));
//        pad("","12");
    }

    static void pad(String p, String digits) {
        if (digits.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = digits.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, digits.substring(1));
        }

    }

    static ArrayList<String> padRet(String p, String digits) {
        if (digits.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = digits.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, digits.substring(1)));
        }
        return list;
    }
}