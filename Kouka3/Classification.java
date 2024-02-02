package Kouka3;

import java.util.Scanner;

//--- 分類クラス ---//
public class Classification {
    void classification() {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        // 多肉植物の分類選択(1～4:分類 0:検索中止)
        System.out.println("\n----------------------------------------------------------\n");
        System.out.println("カテゴリをお選びください。\n");
        System.out.print("1.アロエ:肉厚な葉にトゲがある\n" +
                        "2.セダム:日本の気候向き\n"  +
                        "3.クラッスラ:バラエティ豊かな葉の形\n" +
                        "4.エケベリア:華やかな姿で豊富な種類やサイズがある\n" +
                        "0.検索をやめる\n" +
                        "inupt> ");

        // 例外処理 （例外が発生しなくなるまでループ）
        while (true) {
            try {
                String menu = stdIn.nextLine(); // 数値に変換
                int menuInt = Integer.valueOf(menu); // 数値に変換

                System.out.println("\n----------------------------------------------------------\n");

                if (menuInt == 1) {
                    // アロエの説明(インスタンス生成)
                    Succulent aloe = new Succulent("夏型、春秋型（種類によって異なります）", "アロエ",
                    "アロエは多肉植物には珍しく耐寒性があり直射日光にも強いため、積雪のない暖地であれば戸外で育てることもできます。\n乾燥にも強いので、水やりも頻繁にする必要はなく、滅多に枯れることはありません。\nキダチアロエは赤い花、アロエ・ベラは黄色い花が咲きます。");
                    aloe.explanation(); // explanationメソッドの呼び出し

                } else if (menuInt == 2) {
                    // セダムの説明(インスタンス生成)
                    Succulent sedum = new Succulent("春秋型", "セダム",
                    "セダムは耐暑性や耐寒性に優れ、基本的には日光を好みますが、日陰でも育つ種類もあることから、ガーデニングなどにも使われています。\n基本的には休眠期を迎える真冬と真夏には、水やりを控えめにし、直射日光を避けた日当たりのいい場所で育てます。");
                    sedum.explanation(); // explanationメソッドの呼び出し

                } else if (menuInt == 3) {
                    // クラッスラの説明(インスタンス生成)
                    Succulent crassula = new Succulent("春秋型、夏型（品種によって異なります）", "クラッスラ",
                    "クラッスラは湿度を嫌うので、日当たりがよく風通しのいい場所で育てましょう。\n冬と夏が休眠期なので、この時期の水やりは、表土がかわいてから4〜5日後に与えるなど、控えめにしてください。");
                    crassula.explanation(); // explanationメソッドの呼び出し

                } else if (menuInt == 4) {
                    // エケベリアの説明(インスタンス生成)
                    Succulent echeveria = new Succulent("春秋型", "エケベリア",
                    "エケベリアは日当たりの良い場所を好みますので、雨があたらない風通しの良い戸外でも育てることができます。\n屋内で育てる場合は窓辺に置いてあげましょう。真夏と冬は休眠期にはいるので、水やりは断水するか極力控えてください。");
                    echeveria.explanation(); // explanationメソッドの呼び出し

                } else if (menuInt == 0) {
                    // 検索中止
                    VisualEncyclopedia ve = new VisualEncyclopedia(); // インスタンス生成
                    ve.visualE(); // メソッドの呼び出し


                } else {
                    // 0～4でなかった場合 再入力
                    System.out.print("0～4を入力してください。\ninput > ");
                }

            } catch (NumberFormatException e) {
                // 数値に変換できない場合 再入力
                System.out.println("\n----------------------------------------------------------\n");
                System.out.print("数値を入力してください。\ninput > ");
            }
        }
    }
}
