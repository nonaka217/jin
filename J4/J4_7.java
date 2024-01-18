import java.util.Scanner;

class J4_7 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.println("文字を2つ入力してください");

        System.out.print("1つ目の文字：");
        String x = stdIn.next();

        System.out.print("2つ目の文字：");
        String y = stdIn.next();

        if (x.equals(y)){
            System.out.print("同じ文字です");
        }
        else{
            System.out.print("異なる文字です");
        }
    }
}
