package Kouka3;

//--- メインクラス ---//
public class Kouka3 {

    public static void main(String[] args) {
    
        String border = "-----------------------";
        System.out.println(border + "多肉植物図鑑" + border + "\n");

        VisualEncyclopedia ve = new VisualEncyclopedia(); // インスタンス生成
        ve.visualE(); // メソッドの呼び出し
    }
}
