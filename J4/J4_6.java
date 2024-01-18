import java.util.Scanner;

public class J4_6 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("整数値を入力してください:");
        int x = stdIn.nextInt();

        if (x % 2 == 0)
            System.out.print("偶数です");
        else if (x % 2 == 1)
            System.out.print("奇数です");
    }
}
