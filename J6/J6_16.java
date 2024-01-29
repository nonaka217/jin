import java.util.Scanner;

public class J6_16 {
    
    // 合計を求めるプログラム
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        int num = 0;
        int total = 0;

        // ループ処理(10回入力)
        for (int i = 1; i <= 10; i ++) {
            System.out.print(i + "回目の入力：");
            num = stdIn.nextInt(); // 数値入力
            total += num; // 入力値加算

            // 0が入力された時点で処理終了
            if (num == 0) {
                System.out.println("0が入力されました。");
                break; // ループ処理終了
            }
        }

        System.out.print("合計：" + total); // 合計出力
    }
}
