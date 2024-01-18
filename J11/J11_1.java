import java.util.Scanner;

public class J11_1 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("半径を整数値で入力：");
        Circle circle = new Circle(stdIn.nextInt());
    }
}
