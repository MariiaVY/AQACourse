//2. Implement the method fight() depending on weight, strength and age of the boxer:
//You should write dependency by yourself. The method should return true or false if our boxer won or lost.
public class Boxer {

        public int age;
        public int weight;
        public int strength;

        public Boxer(int age, int weight, int strength) {
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Boxer anotherBoxer) {
            int boxer1 = 0;
            int boxer2 = 0;
            // check strength;
            if (anotherBoxer.strength > strength)
                 boxer2++;
            else if (anotherBoxer.strength < strength)
                 boxer1++;
            // check weight
            if (anotherBoxer.weight > weight);
                boxer2++;
            else if (anotherBoxer.weight < weight);
                boxer1++;
                
            // check age
            if (anotherBoxer.age < age)
                boxer1++;
            else if (anotherBoxer.age > age)
                boxer2++;
            /*   
            if(Boxer1 > Boxer2)
                return true;
            else if(Boxer1 < Boxer2)
                return false;
            else
                return false;
                */
             return boxer1 > boxer2;
        }
        public static void main(String[] args) {
            Boxer ourBoxer = new Boxer(50, 65, 100);
            Boxer anotherBoxer = new Boxer(34, 70, 40);
            System.out.println(ourBoxer.fight(anotherBoxer));
        }
}
