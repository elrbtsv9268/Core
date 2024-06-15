package homework5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();

        Dog dog = new Dog();
        dog.setName("Джек");
        dog.setFood("Кости");
        dog.setLocation("Двор");
        dog.eat();

        Cat cat = new Cat();
        cat.setName("Симба");
        cat.setFood("Whiskas");
        cat.setLocation("Кресло");
        cat.eat();

        Horse horse = new Horse();
        horse.setName("Скакун");
        horse.setFood("Сено");
        horse.setLocation("Конюшня");
        horse.eat();

        Animal[] animals = {dog, cat, horse};
        System.out.println(Arrays.toString(animals));
        treatAnimal();

        String[] animal1 = {"Джек", "Симба", "Скакун"};
        String[] animal2 = {"Кости", "Whiskas", "Сено"};
        String[] animal3 = {"Двор", "Кресло", "Конюшня"};
        for (int i = 0; i < animal1.length; i++) {
            animal.setName(animal1[i]);
            animal.setFood(animal2[i]);
            animal.setLocation(animal3[i]);
            System.out.println(" Нужно посетить ветиринара  " + animal.getName() + " Животное кушает " +
                    animal.getFood() + " Животное живет " + animal.getLocation());
        }
    }

    private static void treatAnimal() {
        Animal animal = new Animal();
        System.out.println("Имя животного " + animal.getName() + "Животное кушает " +
                animal.getFood() + "Животное живет " + animal.getLocation());
    }
}




