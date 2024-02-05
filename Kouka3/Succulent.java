package Kouka3;

//--- 多肉植物クラス ---//
public class Succulent implements Explanation {
    private String growth;     // 生育(タイプ) 変数
    private String plantName; // 植物名 変数
    private String upbringing; // 育て方 変数

    // コンストラクタ
    Succulent(String growth, String plantName, String upbringing) {
        this.growth = growth;
        this.plantName = plantName;
        this.upbringing = upbringing;
    }

    // 説明メソッドの実装
    public void explanation() {
        System.out.println("【生育型：" + growth + "】\n"); // 生育(タイプ)
        System.out.println(plantName + "の育て方"); // 植物名
        System.out.println(upbringing + "\n"); // 育て方
    }
}
