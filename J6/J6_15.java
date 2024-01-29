import java.util. Scanner;

public class J6_15 {

    // 合計を求めるプログラム
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        int total = 0;

        // ループ処理(10回入力)
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "回目の入力：");
            int num = stdIn.nextInt(); // 数値入力
            total += num; // 入力値加算
        }

        // 合計出力
        System.out.println("合計：" + total);
    }
}
