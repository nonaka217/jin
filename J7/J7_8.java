public class J7_8 {
    
    // フィボナッチ数列を画面に行事するプログラム
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = num1 + num2;

        System.out.print(num1 + "," + num2);

        // フィボナッチ数列出力(1000まで)
        while (num3 <= 1000) {
            System.out.print("," + num3); // 数値出力
            num1 = num2; num2 = num3; // 数値入れ替え
            num3 = num1 + num2;
        }
    }
}
