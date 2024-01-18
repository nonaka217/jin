import java.util.Scanner;

public class J6_10 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("直角三角形を描画します。");
        System.out.println("2～20までの整数値を入力してください。");
        System.out.print("底辺の長さを入力：");
        int i = stdIn.nextInt();

        if (i >= 2 && i <= 20){
            for (int x = 1; x <= i; x++){
                for (int y = 1; y <= x; y++){
                    System.out.print('*');
                }
    
                System.out.println();
            }
        }
        else {
            System.out.println("値が正しくありません。");
        }
    }
}
