import java.util.Map;

class Sample1_18 {

    public static void main(String[] args){
        Map<String, String> map = new HashMap<>();

        map.put("東京都", "新宿区");
        map.put("千葉県", "千葉市");
        map.put("神奈川県", "横浜市");
        map.put("埼玉県", "さいたま市");

        System.out.println("東京都:" + map.containsKey("東京都"));
        System.out.println("新宿区:" + map.containsKey("新宿区"));

        map.remove("埼玉県");
        System.out.println("埼玉県:" + map.containsKey("埼玉県"));

        map.remove("神奈川県", "栃木県");
        System.out.println("栃木県:" + map.containsKey("栃木県"));

        System.out.println("要素数:" + map.size());
    }
}
