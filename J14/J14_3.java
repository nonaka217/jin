package J14;

import java.util.Scanner;

public class J14_3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("文字列を入力：");
        String str = stdIn.next();

        StringBuilder sb = new StringBuilder(str);

        sb.delete(10, str.length());
        String str2 = sb.toString();
        System.out.print("結果文字列：" + str2);
    }
}
