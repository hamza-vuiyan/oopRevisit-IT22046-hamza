interface   Car{
    int modelNumber = 0;
    public  void lights();
    public void breaks();
}

class  BMW implements Car{
    int modelNumber = 0;

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public  void lights(){
        System.out.println("Checks lights!");
    }
    public void breaks(){
        System.out.println("Checks Break!");
    }
}

public class Interface {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.setModelNumber(2024);
        bmw.lights();
        bmw.breaks();
        System.out.println("Model Number: " + bmw.modelNumber);
    }
}
