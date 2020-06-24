//6) Create a new class. Make it impossible to create a new object of this class using a constructor.
// Provide an appropriate public method that will allow clients of your class create a new object.
package task6;

public class Bank {
    private Bank() {}

    public static Bank makeMoney() { // Provide an appropriate public method that will allow clients of your class create a new object.
        return new Bank();
    }

    public void fireWorker() {
        System.out.println("You are fired from Bank. ");
    }
      public static void main(String[] args) {
          Bank bank = Bank.makeMoney();
           bank.makeMoney();
    }

  }
   class Worker {
  //  Bank b = new Bank(); //'Bank()' has private access in 'task6.Bank' (Make it impossible to create a new object of this class using a constructor.)
    Bank b =  Bank.makeMoney();
}

