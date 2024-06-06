package core.homework3;

public class Cat {
    private String name = "Dvornyaga";
    private int age = 3;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat() {
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() { return age;  }

    public void setAge(int age) {
        this.age = age;
    }
}
