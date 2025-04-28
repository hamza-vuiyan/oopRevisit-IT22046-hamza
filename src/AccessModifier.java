/**
 * Created by Hp on 28-Apr-25.
 */

class User{
    public String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}


public class AccessModifier {
    public static void main(String[] args) {
        User ujjal = new User("Ujjal Taka", ":fhajfvndskajf");
        User fahim = new User("Fahim", "amivodro");

        String name1 = ujjal.name; // possible because name field is public
        System.out.println(name1);

//        String pass1 = fahim.password; //Not possible because password field  is private
        String passOfFahim = fahim.getPassword();
        System.out.println(passOfFahim);

    }
}
