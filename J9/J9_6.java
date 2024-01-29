public class J9_6 {

    public static void main(String[] args) {

        int[] array = {4, 10, 59, 679, 1991, 3994, 6789, 19324};

        System.out.print("合計値 = " + total(array));
    }

    static int total(int[] array) {

        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        
        return total;
    }
}
