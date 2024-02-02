package Kouka2;

import java.util.Scanner;

// Kouka2_5クラス(メイン)
public class Kouka2_5 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("現在のパスワードを入力してください：");
        String password = stdIn.next(); // パスワードを入力
        StringBuilder pass = new StringBuilder(password);
        pass.sb(); // インスタンス生成
    }
}

// StringBuilderクラス
class StringBuilder {
    String password;
    String password2 = "";

    // コンストラクタ
    StringBuilder(String password) { this.password = password; }

    // sbメソッド
    void sb() {
        System.out.println("セキュリティ上の問題を発見しました。");
        
        // パスワード逆順　ループ処理
        for (int i = password.length(); i > 0; i--) {
            password2 = password2 + password.charAt(i - 1);
        }

        // 新パスワード出力
        System.out.println("セキュリティを強化したパスワードを作成しました。");
        System.out.println("こちらをお使いください");
        System.out.println("あたらしいパスワードは\"" + password2 + "\"です。");
    }
}
