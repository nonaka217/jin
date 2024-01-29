import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class J8_3 {
    
    // 偶数値と奇数値の要素配列を作成するプログラム
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        List<Integer> even_number = new ArrayList<Integer>(); // 空の偶数配列
        List<Integer> odd_number = new ArrayList<Integer>(); // 空の奇数配列

        // ループ処理(10回入力)
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "件目：整数を入力 = ");
            int num = stdIn.nextInt(); // 数値入力
            if (num % 2 == 0) {
                even_number.add(num); // 偶数配列(追加)
            } else {
                odd_number.add(num); // 奇数配列(追加)
            }
        }

        // 偶数・奇数値配列出力
        System.out.println("偶数値配列 = " + even_number);
        System.out.println("奇数値配列 = " + odd_number);
    }
}
