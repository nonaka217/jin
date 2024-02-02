package Kouka3;

//--- メインクラス ---//
public class Kouka3 {

    public static void main(String[] args) {
    
        String border = "-----------------------";
        System.out.println(border + "多肉植物図鑑" + border + "\n");

        Visual_encyclopedia ve = new Visual_encyclopedia(); // インスタンス生成
        ve.visual_E(); // メソッドの呼び出し
    }
}
