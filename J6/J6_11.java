import java.util.Scanner;

class J6_11 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("長方形を描画します。");
        System.out.println("2～20までの整数値を入力してください。");

        System.out.print("行数の入力：");
        int x = stdIn.nextInt();

        if (x < 2 || x > 20){
            System.out.print("値が正しくありません。");
        }

        else {
            System.out.print("列数の入力：");
            int y = stdIn.nextInt();

            if (y < 2 || y > 20){
                System.out.print("値が正しくありません。");
            }

            else {
                for (int xx = 1; xx <= x; xx++){
                    for (int yy = 1; yy <= y; yy++){
                        System.out.print('*');
                    }
                    
                    System.out.println();
                }
            }
        }
    }
}
