public abstract class Shape {

    public abstract String toString();

    public abstract void drow();
    
    public void print(){
        System.out.println(toString());
        drow();
    }
}
