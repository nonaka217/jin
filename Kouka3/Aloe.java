package Kouka3;

import java.util.Scanner;

//--- アロエクラス ---//
public class Aloe extends Succulent {
    // aloe〇 種類名 変数、explanation〇 説明文 変数
    private String aloe1;
    private String explanation1;
    private String aloe2;
    private String explanation2;

    // コンストラクタ
    Aloe(String growth, String plantName, String upbringing, String aloe1, String explanation1, String aloe2, String explanation2) {
        super(growth, plantName, upbringing);
        this.aloe1 = aloe1;
        this.explanation1 = explanation1;
        this.aloe2 = aloe2;
        this.explanation2 = explanation2;
    }

    // 説明メソッド
    public void explanation() {
        super.explanation();

        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        
        System.out.println("アロエ属の人気種紹介");
        System.out.println("1:" + aloe1);
        System.out.println(explanation1 + "\n");
        
        System.out.println("2:" + aloe2);
        System.out.println(explanation2 + "\n");

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
