package homework5;


import java.util.Arrays;

public class Vet extends Animal {
    public void treatAnimal() {
        Animal animal = new Animal();
         System.out.println("Имя животного " + animal.getName() + "Животное кушает " +
                animal.getFood() + "Животное живет " + animal.getLocation());
    }
}




