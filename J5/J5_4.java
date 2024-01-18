import java.util.Scanner;

class J5_4 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("1～12の値を入力してください：");
        int x = stdIn.nextInt();

        switch (x){
            case 3,4,5 : System.out.print("春です"); break;
            case 6,7,8 : System.out.print("夏です"); break;
            case 9,10,11 : System.out.print("秋です"); break;
            case 12,1,2 : System.out.print("冬です"); break;
            default : System.out.print("入力された値が不正です。プログラムを終了します。"); break;
        }
    }
}
