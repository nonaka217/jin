import java.util.Scanner;

class J6_5 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("入力文字列：");
        String i = stdIn.next();
        int num = i.length();

        for (int n = 1; n <= num; n++){
            System.out.println(i.charAt(n - 1));
        }
    }
}
