class Person {
    public String name;
    public String job;

    Person(String name, String job) { this.name = name; this.job = job; }

    void setName(String name) { this.name = name; }
    void setJob(String job) { this.job = job; }

    String getName() { return name; }
    String getJob() { return job; }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + job);
    }
}

class Teacher extends Person {
    public String subject;

    Teacher(String name, String job, String subject) { super(name, job); this.subject = subject; }

    public void introduce() {
        super.introduce(); System.out.println("担当科目：" + subject);
    }
}

class Cook extends Person {
    public String specialities;

    Cook(String name, String job, String specialities) { super(name, job); this.specialities = specialities; }

    public void introduce() {
        super.introduce(); System.out.println("得意料理：" + specialities);
    }
}

public class J12_2 {

    public static void main(String[] args){
        Teacher t = new Teacher("近藤勇", "教員", "Go言語");
        t.introduce();

        System.out.println();

        Cook c = new Cook("沖田総司", "シェフ", "オムライス");
        c.introduce();
    }
}
