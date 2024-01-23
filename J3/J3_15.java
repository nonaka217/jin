import java.util.Scanner;

public class J3_15 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("三角形の面積を求めます");
        
        System.out.print("底辺の長さ:");
        int x = stdIn.nextInt();
        System.out.print("高さ:");
        int y = stdIn.nextInt();

        System.out.print("三角形の面積 = " + (double)x * (double)y / 2);
    }
}
