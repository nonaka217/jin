import java.util.Scanner;

public class J4_1 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("0～100までの得点（整数値）を入力してください：");
        int x = stdIn.nextInt();

        if (x >= 80)
            System.out.print("合格です");
    }
}
