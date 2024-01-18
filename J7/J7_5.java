public class J7_5 {

    public static void main(String[] args){
        int i = 1;

        while (i <= 100){
            if (i % 3 != 0){
                System.out.println(i++);
            }
            else if (i % 3 == 0){
                i++;
                continue;
            }
        }
    }
}
