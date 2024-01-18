public class J6_13 {

    public static void main(String[] args){
        for (int x = 1; x <= 10; x++){
            for (int y1 = 1; y1  < x; y1++){
                System.out.print(" ");
            }
            for (int y2 = 10; y2 >= x; y2--){
                if (y2 == 10)
                    System.out.print("*");
                else if (y2 != 10)
                    System.out.print(" *");
            }
            
            System.out.println();
        }
    }
}