class Circle {

    int radius;
    double circumference;
    double area;
    double PI = 3.1415;

    Circle(int radius){
        circumference = radius * 2 * PI;
        area = radius * radius * PI;

        System.out.println("円周の長さは" + (Math.floor(circumference * 1000) / 1000) + "です。");
        System.out.println("円の面積は" + (Math.floor(area * 1000) / 1000) + "です。");
    }
}
