package Kouka3;

import java.util.Scanner;

//--- 多肉植物クラス ---//
public class Succulent implements Explanation {
    private String growth;     // 生育(タイプ) 変数
    private String plant_name; // 植物名 変数
    private String upbringing; // 育て方 変数

    // コンストラクタ
    Succulent(String growth, String plant_name, String upbringing) {
        this.growth = growth;
        this.plant_name = plant_name;
        this.upbringing = upbringing;
    }

    // 説明メソッドの実装
    public void explanation() {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        System.out.println("【生育型：" + growth + "】\n"); // 生育(タイプ)
        System.out.println(plant_name + "の育て方"); // 植物名
        System.out.println(upbringing); // 育て方

        System.out.println("メニュー選択");
        System.out.print("\n1.検索を続ける 2.終了\ninput > ");

        // 例外処理 （例外が発生しなくなるまでループ）
        while (true) {
            try {
                String menu = stdIn.nextLine(); // 入力
                int menuInt = Integer.valueOf(menu); // 数値に変換
            
                if (menuInt == 1) {
                    // 分類選択
                    Classification menu1 = new Classification(); // インスタンス生成
                    menu1.classification(); // メソッドの呼び出し

                } else if (menuInt == 2) {
                    // プログラム終了
                    End menu3 = new End(); // インスタンス生成
                    menu3.end(); // メソッドの呼び出し

                } else {
                    // 1か2でなかった場合 再入力
                    System.out.println("\n----------------------------------------------------------\n");
                    System.out.print("1か2を入力してください。\ninput > ");
                }

            } catch (NumberFormatException e) {
                // 数値に変換できない場合 再入力
                System.out.println("\n----------------------------------------------------------\n");
                System.out.print("数値を入力してください。\ninput > ");
            }
        }
    }
}
