package Kouka3;

import java.util.Scanner;

//--- 図鑑クラス ---//
public class VisualEncyclopedia {
    void visualE() {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
    
        // メニュー選択
        System.out.println("メニュー選択");
        System.out.print("1.検索 2.終了\ninput > ");

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
