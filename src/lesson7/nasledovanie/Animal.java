package lesson7.nasledovanie;

public class Animal {
    protected String name;


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void eat(){
        System.out.println("Животное кушает");
    }

    public void sleep(){
        System.out.println("Животное спит");
    }
    public void makeNoise(){
        System.out.println("Животное издает звуки");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
