import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class J8_7 {
    
    // 作成した配列を降順にソートし、for文を使って出力するプログラム
    public static void main(String[] args) {

        // 配列作成
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // ソート(降順)
        Collections.sort(array, Collections.reverseOrder());

        // 配列出力
        for (int i = 0; i < 10; i ++) {
            System.out.println(array.get(i));
        }
    }
}
