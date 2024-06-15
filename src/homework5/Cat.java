package homework5;

public class Cat extends Animal {
    protected String kogti;

    public Cat(String food, String location, String name) {
        super.food = food;
        super.location = location;
        super.name = name;
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("Кот кушает");
    }

    public void makeNoise() {
        System.out.println("Кот мяукает");
    }

    public String getKogti() {
        return kogti;
    }

    public void setKogti(String kogti) {
        this.kogti = kogti;
    }
}
