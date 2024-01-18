import java.util.Scanner;

public class J9_1 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        String school = stdIn.next();
        String name = stdIn.next();
        display(school, name);
    }

    public static void display(String school, String name){
        System.out.println("学校名：" + school);
        System.out.println("名前：" + name);
    }
}
