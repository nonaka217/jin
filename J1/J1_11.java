import java.util.Scanner;

class J1_11 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        
        System.out.print("年：");
        int num1 = stdIn.nextInt();

        System.out.print("月：");
        int num2 = stdIn.nextInt();

        System.out.print("日：");
        int num3 = stdIn.nextInt();

        System.out.print(num1 + "/" + num2 + "/" + num3);
    }
}
