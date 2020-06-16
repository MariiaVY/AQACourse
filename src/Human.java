//1. Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
//Requirements:
//a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
//b) Add to the class a constructor with parameters which initialize all the fields.
public class Human {

    int weight;
    int age;
    String firstName;
    String lastName;
    int height;

    Human (int w, int a, String fName, String lName, int h) {
        weight = w;
        age = a;
        firstName = fName;
        lastName = lName;
        height = h;
    }

    static class NewHuman {
        public static void main(String[] args) {
            Human human = new Human(50, 20,"Luisa","Solano", 168);
            System.out.println(human.firstName + " " + human.lastName);
        }
    }
}

