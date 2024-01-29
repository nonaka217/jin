import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class J8_9 {
    
    // 2つの配列の要素を足し算した結果を出力するプログラム
    public static void main(String[] args) {

        // 配列作成
        List<Integer> list_a = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> list_b = new ArrayList<Integer>(Arrays.asList(22, 33, 44, 55, 66));
        List<Integer> list_ab = new ArrayList<Integer>();

        // 2つの配列の要素の足し算
        for (int i = 0; i < 5; i++) {
            list_ab.add(list_a.get(i) + list_b.get(i));
        }

        // 配列出力
        System.out.println("list_a = " + list_a);
        System.out.println("list_b = " + list_b);
        System.out.println("list_a + list_b = " + list_ab);
    }
}
