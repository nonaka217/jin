import java.util.Scanner;

public class J4_2 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("0～100までの得点（整数値を）2つ入力してください");

        System.out.print("国語の得点：");
        int kokugo = stdIn.nextInt();

        System.out.print("英語の得点：");
        int english = stdIn.nextInt();

        if (kokugo == 100 & english == 100){
            System.out.print("満点です");
        }
    }
}
