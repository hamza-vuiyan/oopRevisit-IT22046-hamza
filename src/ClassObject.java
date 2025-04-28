

class Computer{
    String name;
    String OS;
    int year;

    public Computer(String name, String OS, int year) {
        this.name = name;
        this.OS = OS;
        this.year = year;
    }

    public void print(){
        System.out.println("Computer name: " + this.name + "," + " OS: " + this.OS +  ", Year: " + this.year);
    }

}


public class ClassObject {
    public static void main(String[] args) {
        Computer c1 = new Computer("HP", "Windows", 2025);
        Computer c2 = new Computer("DELL", "Ubuntu", 2025);
        Computer c3 = new Computer("MSI", "Fedora", 2025);

        c1.print();

    }
}
