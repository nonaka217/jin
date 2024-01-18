import java.util.Scanner;

class J4_3 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("0～100までの得点（整数値を）2つ入力してください");

        System.out.print("国語の得点：");
        int kokugo = stdIn.nextInt();

        System.out.print("英語の得点：");
        int english = stdIn.nextInt();

        if (kokugo >= 80 & english >= 80)
            System.out.print("2科目とも合格です");
    }
}
