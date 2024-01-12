import java.util.Scanner;

class J7_6 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        int n = 99;
        int num = 0;
        int count = 0;

        while (n != 0){
            System.out.print("整数を入力：");
            n = stdIn.nextInt();
            num += n;

            if (n >= 1)
                count++;
        }

        System.out.println("合計値：" + num);
        System.out.println("平均値：" + num / count);
    }
}
