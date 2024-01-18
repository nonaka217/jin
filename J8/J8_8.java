import java.util.Scanner;

public class J8_8 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        /* 整数値を3つ入力させリストに格納後、最大値と最小値を表示する */
        int max, min;
        /* 整数値リスト */
    	int[] array = new int[3];
        
        System.out.println("整数値を3つ入力してください。");
        /* 入力された整数値をリストに格納 */
        for (int i = 0; i < array.length; i++){
        	// 値を出力
            System.out.print((i+1) + "つ目の整数値：");
        	//リストに格納
        	array[i] = stdIn.nextInt();
        }

        max = min = array[0];
    	// リスト分をループし、最大値、最小値を格納
        for (int i=1; i < array.length; i++){
        	// 現在の最大値がリスト[ インデックス:i ] より大きい場合
            if (max < array[i]){
                max = array[i];
            }
        	// 現在の最小値がリスト[ インデックス:i ] より小さい場合
            if (min > array[i]){
               min = array[i];
            }
        }
    
        /* 最大値を表示 */
        System.out.println("最大値：" + max);
        
        /* 最小値を表示 */
        System.out.println("最小値：" + min);
    }
}
