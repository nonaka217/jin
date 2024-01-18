import java.util.Scanner;

class J4_20 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("3つのテストの得点（整数値）を入力してください");

        System.out.print("1つ目の得点：");
        int x = stdIn.nextInt();

        System.out.print("2つ目の得点：");
        int y = stdIn.nextInt();

        System.out.print("3つ目の得点：");
        int z = stdIn.nextInt();

        if (x + y + z >= 230){
            System.out.print("合格です");
        }
        else if (x + y + z >= 210 & x >= 85 || y >= 85 || z >= 85){
            System.out.print("合格です");
        }
        else{
            System.out.print("補講対象です");
        }
    }
}
