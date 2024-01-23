import java.util.Scanner;

public class J3_16 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("円の面積を求めます");

        System.out.print("半径:");
        int radius = stdIn.nextInt();
        double PI = 3.14159;

        System.out.print("円の面積 = " + radius * radius * PI);
    }
}
