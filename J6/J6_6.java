import java.util.Scanner;

public class J6_6 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("開始数：");
        int x = stdIn.nextInt();
        System.out.print("終了数：");
        int y = stdIn.nextInt();

        int num = 0;

        for (int n = x; n <= y; n++){
            num += n;
        }
        
        System.out.print("合　計：" + num);
    }
}
