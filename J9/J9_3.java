public class J9_3 {

    public static void main(String[] args) {

        String str1 = "Hello";
        int num1 = 3;

        String str2 = "Good morning";
        int num2 = 4;

        String str3 = "Good evening";
        int num3 = 2;

        repetition(str1, num1); repetition(str2, num2); repetition(str3, num3);
    }

    static void repetition(String str, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(str);
        }
    }
}
