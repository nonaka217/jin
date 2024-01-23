import java.util.Scanner;

public class J3_14 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("長方形の面積を求めます。");

        System.out.print("縦の長さ：");
        int x = stdIn.nextInt();
        System.out.print("横の長さ：");
        int y = stdIn.nextInt();

        System.out.print("長方形の面積 = " + (double)x * (double)y);
    }
}
