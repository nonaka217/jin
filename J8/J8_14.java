import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class J8_14 {

    public static void main(String[] args){

        List<String> vegetable = new ArrayList<String>(Arrays.asList("野菜", "キャベツ", "スイカ", "ナス", "ハクサイ"));
        List<String> season = new ArrayList<String>(Arrays.asList("季節", "春", "夏", "秋", "冬"));

        for (int i = 0; i <= vegetable.size(); i++){
            System.out.printf("%-4s:%s\n", vegetable.get(i), season.get(i));
        }
    }
}
