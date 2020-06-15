//1) Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename. Create a third class with the main method.
// In the main method create two different objects of your classes specifying the full name of the classes (including packages).

public class MainSimple {
    public static void main(String[] args) {
        com.domainname.modulename.Simple l = new com.domainname.modulename.Simple();
        com.domainname.modulename1.Simple s = new com.domainname.modulename1.Simple();

    }
}
