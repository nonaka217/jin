import java.util.Scanner;

class J5_5 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("1～3の値を入力してください：");
        int x = stdIn.nextInt();

        switch (x){
            case 1 : System.out.print("パスポートを提示して下さい"); break;
            case 2 : System.out.print("保険証を提示して下さい\nパスポートを提示して下さい"); break;
            case 3 : System.out.print("学生証を提示して下さい\n保険証を提示して下さい\nパスポートを提示して下さい"); break;
            default : System.out.print("不正な入力です"); break;
        }
    }
}
