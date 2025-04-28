/**
 * Created by Hp on 28-Apr-25.
 */

class Parent {
    protected String lineage;
}

class child extends Parent{
    String name;

    public child(String name, String lineage) {
        this.name = name;
        this.lineage = lineage; // Inherited from Parent class
    }
    public void info() {
        System.out.println("Name: " + name);
        System.out.println("Lineage: " + lineage);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        child child1 = new child("Hamza", "Vuiyan");
        child1.info();
    }
}
