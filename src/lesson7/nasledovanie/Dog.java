package lesson7.nasledovanie;

import lesson7.nasledovanie.Animal;

public class Dog extends Animal {
   protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void eat(){
        System.out.println("Собака кушает");
    }


}
