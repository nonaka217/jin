public class J13_3 {
    
    public static void main(String[] args){

        //インスタンス生成
        Teacher t = new Teacher("竹井一馬", "教員", "情報処理");
        t.constract();

        System.out.println();

        //インスタンス生成
        Cook c = new Cook("大原太郎", "シェフ", "オムライス");
        c.constract();
    }
}

//--- Teacherクラス ---//
class Teacher implements Person {
    String name;
    String job;
    String subject;

    //コンストラクタ
    Teacher(String name, String job, String subject) { this.name = name ; this.job = job ; this.subject = subject ; }

    public void constract() {
        //氏名・職種・担当科目 表示
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当科目：" + subject);
    }
}

//--- Cookクラス ---//
class Cook implements Person {
    String name;
    String job;
    String specialties;

    //コンストラクタ
    Cook(String name, String job, String specialties) { this.name = name ; this.job = job ; this.specialties = specialties ; }

    public void constract() {
        //氏名・職種・得意料理 表示
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialties);
    }
}

//--- Personインタフェース ---//
interface Person {
}
