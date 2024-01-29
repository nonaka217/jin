import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class J8_10 {
    
    // 配列を作成し、入力されたインデックス番号の要素を削除・出力するプログラム
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        // 配列作成
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("整数値配列：" + array);
        System.out.print("削除する要素のインデックス番号を入力してください。");
        int num = stdIn.nextInt(); // インデックス番号入力

        while (num < 0 || num >= 10) {
            System.out.println("インデックス番号が不正です。再入力してください。");
            System.out.println();
            System.out.println("整数値配列：" + array);
            System.out.print("削除する要素のインデックス番号を入力してください。");
            num = stdIn.nextInt(); // インデックス番号入力
        }

        array.remove(num); // インデックス番号の要素削除
        System.out.println("削除後の整数値配列=" + array); // 削除後の配列出力
    }
}
