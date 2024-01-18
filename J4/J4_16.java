import java.util.Scanner;

class J4_16 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("0～100までの得点（整数値）を2つ入力してください");

        System.out.print("1つ目の得点：");
        int x = stdIn.nextInt();

        System.out.print("2つ目の得点：");
        int y = stdIn.nextInt();

        if (x == y){
            System.out.print(x);
        }
        else if (x > y){
            System.out.println(x);
            System.out.print(y);
        }
        else if (y > x){
            System.out.println(y);
            System.out.print(x);
        }
    }
}
