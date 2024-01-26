package J14;

import java.util.Objects;
import java.util.Scanner;

public class J14_4 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("文字列を2つ入力してください。");

        System.out.print("1つ目の文字列を入力：");
        String str1 = stdIn.next();
        System.out.print("2つ目の文字列を入力：");
        String str2 = stdIn.next();

        String s1 = str1;
        String s2 = str2;

        if (Objects.equals(s1, s2)) {
            System.out.print("同じ文字列です。");
        } else {
            System.out.print("違う文字列です。");
            
        }
    }
}
