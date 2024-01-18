import java.util.Scanner;

public class J4_17 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("0～100までの国語の得点（整数値）を入力してください:");
        int kokugo = stdIn.nextInt();

        if (kokugo >= 80){
            System.out.print("0～100までの英語の得点（整数値）を入力してください:");
            int english = stdIn.nextInt();

            if (english >= 80){
                System.out.print("合格です");
            }
            else{
                System.out.print("不合格です");
            }
        }
        else{
            System.out.print("0～100までの数学の得点（整数値）を入力してください:");
            int sugaku = stdIn.nextInt();

            if (sugaku >= 80){
                System.out.print("合格です");
            }
            else{
                System.out.print("不合格です");
            }
        }
    }
}
