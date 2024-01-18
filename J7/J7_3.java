import java.util.Scanner;

public class J7_3 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("整数値を入力：");
        int n = stdIn.nextInt();

        do {
            System.out.print(n % 10);
            n /= 10;
        } while (n > 0);
    }
}
