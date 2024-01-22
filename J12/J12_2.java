class Person {
    String name;
    String job;

    Person(String name, String job) { this.name = name; this.job = job; }

    void construct() {
    }

    void introduce() {
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, String job, String subject) { super(name, job); this.subject = subject; }
}

class Cook extends Person {
    String specialities;

    Cook(String name, String job, String specialities) { super(name, job); this.specialities = specialities; }
}

public class J12_2 {
    
    public static void main(String[] args){
    }
}
