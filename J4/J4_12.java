import java.util.Scanner;

class J4_12 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("0～100までの得点（整数値）を入力してください:");
        int x = stdIn.nextInt();

        if (x == 100)
            System.out.print("満点合格です");
        else if (x >= 60 & x < 100)
            System.out.print("合格です");
        else if (x >= 0 & x < 60)
            System.out.print("不合格です");
    }
}