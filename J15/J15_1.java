package J15;

import java.util.Scanner;

public class J15_1 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("整数1 = ");
        int num1 = stdIn.nextInt();
        System.out.print("整数2 = ");
        int num2 = stdIn.nextInt();

        try {
            double answer = num1 / num2;
            
            System.out.println(num1 + " / " + num2 + " = " + answer);
            System.out.println("処理終了");
        } catch (ArithmeticException e) {
            System.out.println("0による割り算です！！");
            System.out.println("処理終了");
        }
    }
}
