import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("クラスの人数を入力してください:");
        int num = Integer.parseInt(stdIn.nextLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < num; i++){
            System.out.print((i + 1) + "人目の年齢を入力してください:");
            list.add(Integer.parseInt(stdIn.nextLine()));
        }
        int sum = 0;
        for (int i = 0; i < num; i++){
            sum = sum + list.get(i);
        }
        double ave = (double)sum/num;
        System.out.println("クラスの平均年齢は" + ave + "歳です。");
        HashMap<String,Integer> map = new HashMap<>();
        map.put("江藤", 34);
        map.put("加藤", 27);
        map.put("佐藤", 29);
        map.put("伊藤", 42);
        map.put("後藤", 38);

        int sum2 = 0;
        for (String name: map.keySet()) {
            sum2 += map.get(name);
            System.out.println("名前" + name + "先生 年齢:" + map.get(name));
        }
        double ave2 = (double)sum2/map.size();
        System.out.println("先生の平均年齢は" + ave2 + "歳です。");
    }
}
