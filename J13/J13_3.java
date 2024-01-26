public class J13_3 {
    
    public static void main(String[] args){

        Teacher t = new Teacher("竹井一馬", "教員", "情報処理");
        t.introduce();

        System.out.println();

        Cook c = new Cook("大原太郎", "シェフ", "オムライス");
        c.introduce();
    }
}

class Teacher implements Person {
    String name;
    String job;
    String subject;

    // public Teacher(String name, String job, String subject)
    // { 
    //     this.name = name;
    //     this.job = job;
    //     this.subject = subject; 
    // }
    public Teacher(String name, String job, String subject) {
        this.name = name;
        this.job = job;
        this.subject = subject;
    }
    

    public void introduce(){ 
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当科目：" + subject);
    }

}

class Cook implements Person {
    String name;
    String job;
    String specialties;

    public Cook(String name, String job, String specialties){ this.name = name; this.job = job; this.specialties = specialties; }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialties);
    }
}

interface Person {
    public void introduce();
}
