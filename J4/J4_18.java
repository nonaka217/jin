import java.util.Scanner;

public class J4_18 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("0～100までの得点（整数値）を2つ入力してください");

        System.out.print("1つ目の得点：");
        int x = stdIn.nextInt();

        System.out.print("2つ目の得点：");
        int y = stdIn.nextInt();

        if (x >= 80 & y >= 80){
            System.out.print("合格です");
        }
        else if (x >= 80 || y >= 80){
            System.out.print("補欠合格です");
        }
        else{
            System.out.print("不合格です");
        }
    }
}
