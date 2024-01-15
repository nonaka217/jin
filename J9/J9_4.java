import java.util.Scanner;

class J9_4 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in , "Shift-JIS");

        System.out.print("整数を入力してください：");
        int x = stdIn.nextInt();
        int y = x;

        System.out.print(y + "の9倍は" + multiple(x) + "です。");
    }

    static int multiple(int x){
        int multiple = x * 3;
        return multiple;
    }
}
