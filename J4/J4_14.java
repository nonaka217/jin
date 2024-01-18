import java.util.Scanner;

public class J4_14 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("0～100までの整数値を2つ入力してください");

        System.out.print("1つ目の値：");
        int x = stdIn.nextInt();

        System.out.print("2つ目の値：");
        int y = stdIn.nextInt();

        if (x == y)
            System.out.print("同じ値です");
        else if (x > y)
            System.out.print(String.format("大きいほうの値は%dです", x));
        else if (x < y)
            System.out.print(String.format("大きいほうの値は%dです", y));
    }
}
