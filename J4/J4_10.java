import java.util.Scanner;

class J4_10 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("0～100までの得点（整数値）を2つ入力してください:");
        int x = stdIn.nextInt();
        if (x >= 0 & x <= 100){
            System.out.print("正しい入力値です");
        }
        else{
            System.out.print("入力値が不正です");
        }
    }
}
