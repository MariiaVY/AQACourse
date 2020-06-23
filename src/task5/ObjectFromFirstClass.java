package task5;

public class ObjectFromFirstClass {
    public static void main(String args[])
    {
        PrivateClass s = new PrivateClass(); //trying to access private method of another class
      //  s.sing(); //Error:(7, 10) java: sing() has private access in task5.privateClass
    }
}
