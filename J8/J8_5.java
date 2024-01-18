public class J8_5 {

    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5};
        int total = 0;

        for (int i = 0; i < array.length; i++){
            total += array[i];
        }

        float mean = total / array.length;

        System.out.println("合計値は" + total + "です。");
        System.out.println("平均値は" + mean + "です。");
    }
}
