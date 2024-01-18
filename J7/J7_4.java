public class J7_4 {

    public static void main(String[] args){
        int n = 1;
        int num = 0;
        
        while (num < 100000) {
            num += n++;
        }

        System.out.print("合計が100000を超えるnは" + (n - 1) + "です。");
    }
}
