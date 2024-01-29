import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class J8_4 {
    
    // 0～99までの乱数を10個作成し、その配列・合計値・最大値を出力するプログラム
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> random_number = new ArrayList<Integer>(); // 空の乱数配列

        // ループ処理(10回)
        for (int i = 1; i <= 10; i++) {
            random_number.add(rand.nextInt(100) + 1);
        }

        // 合計値取得
        int sum = random_number.stream().mapToInt(Integer::intValue).sum();
        // 最大値取得
        int max = Collections.max(random_number);

        // 合計値・最大値出力
        System.out.println("合計値は" + sum + "です。");
        System.out.println("最大値は" + max + "です。");

        // 配列の出力
        for (int i = 0; i < 10; i++) {
            System.out.println("配列[" + i + "]：" + random_number.get(i));
        }
    }
}
