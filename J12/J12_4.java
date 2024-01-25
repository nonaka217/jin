class Animal {
    String name;
    String food;

    Animal(String name) { this.name = name; }
    
    void setName(String name) { this.name = name; }
    String getName() { return name; }

    void move() {
        System.out.print(name + "は、");
    }

    void eat() {
        System.out.println(name + "は、" + food + "を食べました。");
    }
}

class Dog extends Animal {
    int length;

    Dog(String name, int length) { super(name); this.length = length; }

    void move() {
        super.move(); System.out.println(length + "メートル走りました。");
    }
}

class Bird extends Animal {
    int length;

    Bird(String name, int length) { super(name); this.length = length; }

    void move() {
        super.move(); System.out.println(length + "メートル飛びました。");
    }
}

class Whale extends Animal {
    int length;

    Whale(String name, int length) { super(name); this.length = length; }

    void move() {
        super.move(); System.out.println(length + "キロメートル泳ぎました。");
    }
}

public class J12_4 {

    public static void main(String[] args){
        Dog a = new Dog("犬", 10);
        a.move();
        Bird b = new Bird("鳥", 1000);
        b.move();
        Whale c = new Whale("鯨", 50);
        c.move();
    }
}
