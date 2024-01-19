public class J11_7 {

    public static void main(String[] args){
        // 学生情報
        Student A = new Student("Aさん", 001, 89, 65, 88);
        Student B = new Student("Bさん", 002, 80, 95, 64);
        Student C = new Student("Cさん", 003, 70, 80, 98);

        A.test_ave();
        System.out.println();
        B.test_ave();
        System.out.println();
        C.test_ave();
    }
}

//--- Studentクラス ---//
class Student {
    private String name; // 名前
    private int no; //学生番号
    private int kokugo; // 国語
    private int sugaku; // 数学
    private int english; // 英語

    //--- コンストラクタ ---//
    Student(String name, int no, int kokugo, int sugaku, int english){
        this.name = name;
        this.no = no;
        this.kokugo = kokugo;
        this.sugaku = sugaku;
        this.english = english;
    }

    //--- 平均点算出メソッド ---//
    void test_ave(){
        double ave = ((double)kokugo + (double)sugaku + (double)english) / 3;
        System.out.print(String.format("%03d", no) + "番　");
        System.out.print(name);
        System.out.print("　平均点" + (Math.floor(ave * 100))/ 100);

    }

    //--- 合計点算出メソッド ---//
    void tesu_sum(){
        int sum = kokugo + sugaku + english;
        System.out.print(String.format("%03d", no) + "番　");
        System.out.print(name);
        System.out.print("　合計点" + sum);
    }
}
