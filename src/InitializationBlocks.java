//7. Create a simple class with some fields. Demonstrate in your class how we can use initialization blocks.

public class InitializationBlocks {
        {
            System.out.println("Inside instance initializer block");
        }
    InitializationBlocks(int number, int id){
            System.out.println("Inside constructor "  + number + " " + id);
        }
        public static void main(String[] arguments) {
            InitializationBlocks block1 = new InitializationBlocks(43, 45);
            InitializationBlocks block2 = new InitializationBlocks(65, 93);
    }
}


//8. Find the information about the order of initialation, when you create a new object of a class:
//When constructors, initialization blocks are being executed. When fields are initialized with default values.


//Instance Initialization Blocks : IIB are used to initialize instance variables. IIBs are executed before constructors.
// They run each time when object of the class is created. Initializer block : contains the code that is always executed whenever an instance is created.
// It is used to declare/initialize the common part of various constructors of a class.
//Constructors : are used to initialize the object’s state. Like methods,
// a constructor also contains collection of statements(i.e. instructions) that are executed at time of Object creation.
//Order of execution of Initialization blocks and constructor in Java:
//Static initialization blocks will run whenever the class is loaded first time in JVM
//Initialization blocks run in the same order in which they appear in the program.
//Instance Initialization blocks are executed whenever the class is initialized and before constructors are invoked. They are typically placed above the constructors within braces.

// Local variables, which have no default value and cannot be used until explicitly initialized, the fields of a class are automatically initialized to the default values.
// Essentially, every field of a primitive type is initialized to a default value of false or zero, as appropriate. All fields of reference type are, by default, initialized to null.
