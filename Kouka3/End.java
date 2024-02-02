package Kouka3;

import java.util.Scanner;

//--- 終了クラス ---//
public class End {
    void end() {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        // ダブルチェック
        System.out.println("\n----------------------------------------------------------\n");
        System.out.println("本当にプログラムを終了させますか。");
        System.out.print("1.はい 2.いいえ > ");

        // 例外処理 （例外が発生しなくなるまでループ）
        while (true) {
            try {
                String menu = stdIn.nextLine(); // 入力
                int menu_int = Integer.valueOf(menu); // 数値に変換
        
                if (menu_int == 1) {
                    System.out.println("\nプログラムを終了します。\nご利用ありがとうございました。");
                    System.exit(0); // プログラム終了

                } else if (menu_int == 2) {
                    System.out.println("\n----------------------------------------------------------\n");
                    // TOPのメニュー選択に戻る
                    Visual_encyclopedia ve = new Visual_encyclopedia(); // インスタンス生成
                    ve.visual_E(); // メソッドの呼び出し

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
