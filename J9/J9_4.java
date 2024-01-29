import java.util.Scanner;

public class J9_4 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in , "Shift-JIS");

        System.out.print("整数を入力してください：");
        int num = stdIn.nextInt();
        int num2 = multiple(num);

        System.out.print(num + "の9倍は" + multiple(num2) + "です。");
    }

    static int multiple(int num){
        int num3 = num * 3;
        return num3;
    }
}
