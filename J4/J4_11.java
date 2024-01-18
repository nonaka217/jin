import java.util.Scanner;

class J4_11 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("数値4桁で西暦を入力して下さい:");
        int x = stdIn.nextInt();

        if (x % 400 == 0){
            System.out.print("閏年です");
        }
        else if (x % 100 == 0){
            System.out.print("平年です");
        }
        else if (x % 4 == 0){
            System.out.print("閏年です");
        }
        else{
            System.out.print("平年です");
        }
    }
}
