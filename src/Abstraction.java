abstract class AbstractClass{
    abstract void display();
    void show(){
        System.out.println("This is a normal method in abstract class.");
    }
}

class Nobody extends AbstractClass{
    void display(){
        System.out.println("This is an implementation of abstract class.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Nobody nobody1 = new Nobody();
        nobody1.show();
        nobody1.display();
    }
}
