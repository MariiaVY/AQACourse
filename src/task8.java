//8) Create a new class. Add 5 private fields. Add getter and setters to all the fields.

public class task8 {
    private int age;
    private String clothes;
    private String music;
    private int speed;
    private String day;

    public task8() {
    }

    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public String getMusic() {
        return music;
    }
    public void setMusics(String newMusic){
        music = newMusic;
    }

    public String getClothes() {
        return clothes;
    }
    public void setClothes(String newClothes){
        clothes = newClothes;
    }
    public String getDay() {
        return day;
    }
    public void setDay(String newDay){
        day = newDay;
    }

    public static void main(String[] args) {
        task8 t = new task8();
        int age = t.getAge();
        t.setAge(30);
        int speed = t.getSpeed();
        t.setSpeed(20);
        String music = t.getMusic();
        t.setMusics("Sad");
        String clothes = t.getClothes();
        t.setClothes("Coat");
        String day = t.getDay();
        t.setDay("Friday");
        System.out.println(t.getAge() + ", " + t.getSpeed() + ", " + t.getMusic() + ", " + t.getClothes() + ", " + t.getDay());
    }
}

