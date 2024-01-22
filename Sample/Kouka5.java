import java.util.Scanner;

public class Kouka5 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        int sum = 0;

        for (int i = 1; i <= 5; i++){
            System.out.print(i + "教科目の点数を入力してください:");
            int num = stdIn.nextInt();
            if (num >= 0 & num <= 100){
                sum = sum + num;
            }
            else{
                System.out.println("不正な点数を検知しました。0点とします。");
            }
        }
        
        double ave = (double)sum / 5;
        
        System.out.println("合計点 = " + sum);
        System.out.println("平均点 = " + ave);
    }
}
