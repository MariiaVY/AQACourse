//3. Create 3 different classes to demonstrate the relationships "has-a" and "uses-a".
// They can be anything you want. For example: Car - Engine - Wheels
package Car;

    class Engine {
        int capacity;
        public int getCapacity() {
            return capacity;
        }
        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

         static class Wheels {
            int number;
            public int getNumber() {
                return number;
            }
            public void setNumber(int number) {
                this.number = number;
            }
        }

        static class Car {
            public static void main(String[] args) {
                Engine eng = new Engine();
                Wheels wh = new Wheels();
                eng.setCapacity(2000);
                System.out.println(eng.getCapacity());
                wh.setNumber(4);
                System.out.println(wh.getNumber());
            }
        }
}
