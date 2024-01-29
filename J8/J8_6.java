import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class J8_6 {
    
    // ソート前の配列とソート後(降順)の配列を出力するプログラム
    public static void main(String[] args) {

        // 配列作成
        List<Integer> array = new ArrayList<Integer>(Arrays.asList(10, -10, 40, -15, 90, 15, -80));

        // ソート前配列出力
        System.out.println("ソート前：" + array);

        // ソート(降順)
        Collections.sort(array, Collections.reverseOrder());
        // ソート後配列出力
        System.out.println("ソート後：" + array);
    }
}
