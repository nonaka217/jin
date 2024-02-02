package Kouka3;

//--- 多肉植物クラス ---//
public class Succulent implements Explanation {
    private String growth;     // 生育(タイプ) 変数
    private String plant_name; // 植物名 変数
    private String upbringing; // 育て方 変数

    // コンストラクタ
    public Succulent(String growth, String plant_name, String upbringing) {
        this.growth = growth;
        this.plant_name = plant_name;
        this.upbringing = upbringing;
    }

    // 説明メソッドの実装
    public void explanation() {
        System.out.println("【生育型：" + growth + "】\n");
        System.out.println(plant_name + "の育て方");
        System.out.println(upbringing);

        System.out.println("\n次の検索に進む場合はEnterを押してください。");

        Classification c = new Classification(); // インスタンス生成
        c.classification(); // メソッドの呼び出し
    }
}
