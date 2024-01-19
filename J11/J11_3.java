public class J11_3 {

    public static void main(String[] args){
        Operation operation = new Operation();
    }
}

class Operation {
    public int x = 100;
    public int y = 200;
    int sum = 0;

    Operation(){

        for (int i = x; i <= y; i++){
            sum = sum + i;
        }

        System.out.print("100から200までの合計値は" + sum + "です。");
    }
}
