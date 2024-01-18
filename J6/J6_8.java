public class J6_8 {

    public static void main(String[] args){
        for (int x = 9; x >= 1; x--){
            System.out.println(x + "の段");

            for (int y = 9; y >= 1; y--){
                System.out.println(x + " × " + y + "=" + x * y);
            }
        }
    }
}
