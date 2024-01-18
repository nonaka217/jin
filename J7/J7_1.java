public class J7_1 {

    public static void main(String[] args){
        int n = 1;
        int num = 0;

        while (n <= 100){
            num += n++;
        }

        System.out.print("合計：" + num);
    }
}
