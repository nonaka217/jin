import java.util.Scanner;

public class J4_15 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("0～100までの整数値を2つ入力してください");

        System.out.print("1つ目の値：");
        int x = stdIn.nextInt();

        System.out.print("2つ目の値：");
        int y = stdIn.nextInt();

        System.out.print("3つ目の値：");
        int z = stdIn.nextInt();

        if (x == y & x == z)
            System.out.print("同じ値です");
        else if (x > y & x > z)
            System.out.print(String.format("大きいほうの値は%dです", x));
        else if (y > x & y > z)
            System.out.print(String.format("大きいほうの値は%dです", y));
        else if (z > x & z > y)
            System.out.print(String.format("大きいほうの値は%dです", z));
    }
}
