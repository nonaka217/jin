class J7_2 {

    public static void main(String[] args){
        int n = 1;
        int num = 0;

        do {
            num += n++;
        } while (n <= 100);

        System.out.print("合計：" + num);
    }
}
