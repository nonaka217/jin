import java.util.Scanner;

public class J6_14 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        // 数字入力
        System.out.print("入力値：");
        int num = stdIn.nextInt();

        int primes = 0;

        // 素数判断
        for (int i = 2; i < num; i++) {
            // 割り切れた（1と入力値以外で）時点で終了
            if (num % i == 0) {
                primes += 1;
                break; // ループ処理終了
            }
        }

        if (primes == 0) {
            // 素数の場合の出力
            System.out.print(num + "は素数です。");
        } else {
            // 素数出ない場合の出力
            System.out.print(num + "は素数ではありません");
        }
    }
}
