import java.util.Arrays;
import java.util.Scanner;

public class J9_7 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        int[] array = {4, 10, 59, 679, 1991, 3994, 6789, 19324};

        System.out.print("整数を入力してください：");
        int num = stdIn.nextInt();

        boolean e = existence(array, num);

        if (e) {
            System.out.print(num + "は配列に含まれています。");
        } else {
            System.out.print(num + "は配列に含まれていません。");
        }
    }

    static boolean existence(int[] array, int num) {
        boolean e = Arrays.asList(array).contains(num);
        return e;
    }
}
