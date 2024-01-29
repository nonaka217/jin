import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class J8_14 {

    // 連想配列を作成し、for文を使って要素を出力
    public static void main(String[] args) {

        // 連想配列作成
        HashMap<String, String> season = new HashMap<String, String>();
        season.put("野菜", "季節");
        season.put("キャベツ", "春");
        season.put("スイカ", "夏");
        season.put("ナス", "秋");
        season.put("ハクサイ", "冬");

        Set<Map.Entry<String, String>> s = season.entrySet();
        List<Map.Entry<String, String>> array = new ArrayList<>(s);

        // 要素の出力
        for (int i = 0; i < array.size(); i++) {
            System.out.printf("%-4s:%s\n", array.get(i).getKey(), array.get(i).getValue());
        }
    }
}
