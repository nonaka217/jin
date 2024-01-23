public class J13_1 {

    public static void main(String[] args){
        Teacher t = new Teacher();
        t.print();
        System.out.println("");
        Cook c = new Cook();
        c.print();
    }
}

public class Teacher extends Person {
    public Teacher(){
    }

    @Override
    public String name(){
        return "竹井一馬";
    }

    @Override
    public String job(){
        return "教員";
    }

    @Override
    public String drow(){
        String subject = "情報処理";
        System.out.println("担当科目" + subject);
    }
}

public class Cook extends Person {
    public Cook(){
    }

    @Override
    public String name(){
        return "大原太郎";
    }

    @Override
    public String job(){
        return "シェフ";
    }

    @Override
    public String drow(){
        String specialties = "オムライス";
        System.out.println("得意料理" + specialties);
    }
}

public abstract class Person {
    public abstract String name();
    public abstract String job();
    public abstract String drow();
    public void print(){
        System.out.println("氏名：" + name());
        System.out.println("職種：" + job());
        drow();
    }
} 
