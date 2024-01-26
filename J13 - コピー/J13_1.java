public class J13_1 {

    public static void main(String[] args){

        Teacher t = new Teacher("情報処理"); //インスタンス生成
        t.construct();
        System.out.println();
        Cook c = new Cook("オムライス"); //インスタンス生成
        c.construct();
    }
}

//--- Teacherクラス ---//
class Teacher extends Person {
    String subject;

    //コンストラクタ
    public Teacher(String subject) { this.subject = subject; }

    @Override
    public String name() {
        return "竹井一馬";
    }

    @Override
    public String job() {
        return "教員"; 
    }

    public void construct() {
        super.construct(); System.out.println("得意料理：" + subject);
    }
}

//--- Cookクラス ---//
class Cook extends Person {
    String specialties;

    //コンストラクタ
    public Cook(String specialties) { this.specialties = specialties; }

    @Override
    public String name() {
        return "大原太郎";
    }

    @Override
    public String job() {
        return "シェフ";
    }

    public void construct() {
        super.construct(); System.out.println("担当科目：" + specialties);
    }
}

//--- Personクラス ---//
abstract class Person {
    abstract String name();
    abstract String job();

    public void construct() {
        System.out.println("氏名：" + name());
        System.out.println("職種：" + job());
    }
}