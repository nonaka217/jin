import java.util.Scanner;

class J1_10 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("文字の入力:");
        String str = stdIn.next();

        System.out.print("整数の入力:");
        int num1 = stdIn.nextInt();

        System.out.print("小数の入力:");
        float num2 = stdIn.nextFloat();

        System.out.println("入力された文字 ＝ " + str);
        System.out.println("入力された整数 ＝ " + num1);
        System.out.println("入力された小数 ＝ " + num2);
    }
}
