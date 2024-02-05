package Kouka3;

import java.util.Scanner;

//--- セダムクラス ---//
public class Sedum extends Succulent {
    // sedum〇 種類名 変数、explanation〇 説明文 変数
    private String sedum1;
    private String explanation1;
    private String sedum2;
    private String explanation2;
    private String sedum3;
    private String explanation3;
    private String sedum4;
    private String explanation4;

    // コンストラクタ
    Sedum(String growth, String plantName, String upbringing, String sedum1, String explanation1, String sedum2, String explanation2, String sedum3, String explanation3, String sedum4, String explanation4) {
        super(growth, plantName, upbringing);
        this.sedum1 = sedum1;
        this.explanation1 = explanation1;
        this.sedum2 = sedum2;
        this.explanation2 = explanation2;
        this.sedum3 = sedum3;
        this.explanation3 = explanation3;
        this.sedum4 = sedum4;
        this.explanation4 = explanation4;
    }
    
    // 説明メソッド
    public void explanation() {
        super.explanation();

        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        
        System.out.println("セダム属の人気種紹介");
        System.out.println("1:" + sedum1);
        System.out.println(explanation1 + "\n");
        
        System.out.println("2:" + sedum2);
        System.out.println(explanation2 + "\n");
        
        System.out.println("3:" + sedum3);
        System.out.println(explanation3 + "\n");
        
        System.out.println("4:" + sedum4);
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
