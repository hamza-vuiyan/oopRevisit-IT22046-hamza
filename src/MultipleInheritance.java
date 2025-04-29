interface Father{
    void hair();
}

interface Mother{
    void eyes();
}

class children implements Father, Mother{
    public void eyes(){
        System.out.println("Child has mother's eyes.");
    }
    public void hair(){
        System.out.println("Child has father's hair.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        children child1 = new children();
        child1.hair();
        child1.eyes();
    }
}
