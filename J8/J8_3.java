import java.util.Scanner;

class J8_3 {

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        int[] even_num = new int[10];
        int[] odd_num = new int[10];
        int count1 = 0;
        int count2 = 0;

        for (int i = 1; i <= 10; i++){
            System.out.print(i + "件目：整数を入力 = ");
            int x = stdIn.nextInt();

            if (x % 2 == 0){
                even_num[count1] = x;
                count1 += 1;
            }
            else if (x % 2 == 0){
                odd_num[count2] = x;
                count2 += 1;
            }
        }

        System.out.println("偶数値配列 = " + even_num);
        System.out.println("奇数値配列 = " + odd_num);
    }
}
