import java.util.Scanner;

public class J5_1 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("A～Dの値を入力してください：");
        String x = stdIn.next();

        switch (x){
            case "A" : System.out.print("ランクAは評価「優」です"); break;
            case "B" : System.out.print("ランクBは評価「良」です"); break;
            case "C" : System.out.print("ランクCは評価「可」です"); break;
            case "D" : System.out.print("ランクDは評価「不可」です"); break;
        }
    }
}
