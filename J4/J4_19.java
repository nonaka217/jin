import java.util.Scanner;

public class J4_19 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("整数値を入力してください:");
        int x = stdIn.nextInt();

        if (x >= 1){
            System.out.print("正の数です");
        }
        else if(x < 0){
            System.out.print("負の数です");
        }
    }
}
