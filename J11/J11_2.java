public class J11_2 {

    public static void main(String[] args){
        Operation operation = new Operation();
    }
}

class Operation {
    public static int x = 100;
    public static int y = 200;
    int sum = 0;

    Operation(){

        for (int i = x; i <= y; i++){
            sum = sum + i;
        }

        System.out.print("100から200までの合計値は" + sum + "です。");
    }
}
