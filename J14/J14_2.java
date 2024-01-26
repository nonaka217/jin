package J14;

import java.util.Scanner;

public class J14_2 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("文字列を入力：");
        String str = stdIn.next();

        String str2 = str;
        int str_l = str2.length();
        System.out.print("入力された文字数は" + str_l + "です。");
    }
}
