package J15;

import java.util.Scanner;

public class J15_2 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("整数を入力 = ");

        try {
            String num = stdIn.next();
            int int_num = Integer.parseInt(num);

            if (int_num % 2 == 0) {
                System.out.println(num + " は偶数");
            } else {
                System.out.println(num + " は奇数");
            }
        } catch (NumberFormatException e) {
            System.out.println("整数と認識できません！！");
        }
    }
}
