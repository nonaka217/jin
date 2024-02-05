package Kouka3;

import java.util.Scanner;

//--- エケベリアクラス ---//
public class Echeveria extends Succulent {
    // echeveria〇 種類名 変数、explanation〇 説明文 変数
    private String echeveria1;
    private String explanation1;
    private String echeveria2;
    private String explanation2;
    private String echeveria3;
    private String explanation3;
    private String echeveria4;
    private String explanation4;

    // コンストラクタ
    Echeveria(String growth, String plantName, String upbringing, String echeveria1, String explanation1, String echeveria2, String explanation2, String echeveria3, String explanation3, String echeveria4, String explanation4) {
        super(growth, plantName, upbringing);
        this.echeveria1 = echeveria1;
        this.explanation1 = explanation1;
        this.echeveria2 = echeveria2;
        this.explanation2 = explanation2;
        this.echeveria3 = echeveria3;
        this.explanation3 = explanation3;
        this.echeveria4 = echeveria4;
        this.explanation4 = explanation4;
    }

    // 説明メソッド
    public void explanation() {
        super.explanation();
        
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        
        System.out.println("エケベリア属の人気種紹介");
        System.out.println("1:" + echeveria1);
        System.out.println(explanation1 + "\n");
        
        System.out.println("2:" + echeveria2);
        System.out.println(explanation2 + "\n");

        
        System.out.println("3:" + echeveria3);
        System.out.println(explanation3 + "\n");
        
        System.out.println("4:" + echeveria4);
        System.out.println(explanation4 + "\n");

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
