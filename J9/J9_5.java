import java.util.Scanner;

public class J9_5 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("整数を入力して下さい：");
        int x = stdIn.nextInt();
        System.out.print("整数を入力して下さい：");
        int y = stdIn.nextInt();

        addition(x, y);
        subtraction(x, y);
        multiplication(x, y);
        division(x, y);
        remainder(x, y);
    }

    public static void addition(int x, int y){
        System.out.println(x + "+" + y + "=" + (x + y));
    }

    public static void subtraction(int x, int y){
        System.out.println(x + "-" + y + "=" + (x - y));
    }

    public static void multiplication(int x, int y){
        System.out.println(x + "*" + y + "=" + x * y);
    }

    public static void division(int x, int y){
        System.out.println(x + "/" + y + "=" + x / y);
    }

    public static void remainder(int x, int y){
        System.out.println(x + "%" + y + "=" + x % y);
    }

    
}
