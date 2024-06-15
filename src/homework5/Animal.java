package homework5;

public class Animal {

    protected String food;
    protected String location;
    protected String name;


    public void eat() {
        System.out.println("Такое-то животное кушает");
    }

    public void sleep() {
        System.out.println("Такое-то животное спит");
    }

    public void makeNoise() {
        System.out.println("Такое-то животное издает звуки");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
