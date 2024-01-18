import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class J8_5_list {

    public static void main(String[] args){

        List<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int total = 0;

        for (int i = 0; i < array.size(); i++){
            total += array.get(i);
        }

        float mean = total / array.size();

        System.out.println("合計値は" + total + "です。");
        System.out.println("平均値は" + mean + "です。");
    }
}
