import java.util.Scanner;

class Calculator {
    int x;
    int y;

    Calculator(int x, int y) { this.x = x; this.y = y; }

    void setX(int x) { this.x = x; }
    void setY(int y) { this.x = y; }
    
    int getX() { return x; }
    int getY() { return y; }

    void calcSum() {
        System.out.println("Sum " + x + " and " + y + " = " + (x + y));
    }

    void caluAve() {
        System.out.println("Average " + x + " and " + y + " = " + (x + y) / 2);
    }
}

class MoreCalc extends Calculator {
    MoreCalc(int x, int y) { super(x, y); }

    void caluPow(){
        super.calcSum(); super.caluAve(); System.out.print("Power " + x + " of " + y + " = " + (int)Math.pow(x, y));
    }
}

public class J12_1 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("整数を入力してください：");
        int x = stdIn.nextInt();
        System.out.print("整数を入力してください：");
        int y = stdIn.nextInt();

        MoreCalc a = new MoreCalc(x, y);

        a.caluPow();
    }
}
