package core.homework3;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    public static Random random = new Random();

    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            Cat cat = new Cat();
            System.out.println("Котика зовут " + cat.getName() + " Возраст котика " + cat.getAge());
            --i;
        }
        String[] catsName1 = {"Том", "Боб", "Барсик", "Снежок", "Марго", "Джери", "Мурка", "Симба", "Пушок", "Рыжик",
                "Мурзик", "Васька", "Кузя", "Сенька", "Маркиз", "Котлетка", "Барбариска", "Дуся", "Киса", "Тишка"};
        for (int j = 0; j < 10; j++) {
            Cat cat = new Cat();
            int x = random.nextInt(20);
            cat.setName(catsName1[x]);
            int r = random.nextInt(28) + 1;
            cat.setAge(r);
            System.out.println("Котика зовут " + cat.getName() + " Возраст котика " + cat.getAge());
        }
        String[] catsName2 = {"Мурзик", "Васька", "Кузя", "Сенька", "Маркиз", "Котлетка", "Барбариска", "Дуся", "Киса", "Тишка"};
        int[] catsAge2 = {2, 16, 3, 12, 22, 1, 5, 25, 7, 10};
        int k = 0;
        do {
            Cat cat = new Cat(catsName2[k], catsAge2[k]);
            System.out.println("Котика зовут " + cat.getName() + " Возраст котика " + cat.getAge());
            k++;
        } while (k < 10);

        String[] catsName3 = {"Мурзик", "Васька", "Кузя", "Сенька", "Маркиз"};
        for (String s : catsName3) {
            Cat cat = new Cat();
            int x = random.nextInt(5);
            cat.setName(catsName3[x]);
            int r = random.nextInt(28) + 1;
            cat.setAge(r);
            System.out.println("Котика зовут " + cat.getName() + " Возраст котика " + cat.getAge());
        }

        Cat cat1 = new Cat();
        cat1.setName("Мурзик");
        cat1.setAge(random.nextInt(28) + 1);
        Cat cat2 = new Cat();
        cat2.setName("Васька");
        cat2.setAge(random.nextInt(28) + 1);
        Cat cat3 = new Cat();
        cat3.setName("Кузя");
        cat3.setAge(random.nextInt(28) + 1);
        Cat cat4 = new Cat();
        cat4.setName("Сенька");
        cat4.setAge(random.nextInt(28) + 1);
        Cat cat5 = new Cat();
        cat5.setName("Маркиз");
        cat5.setAge(random.nextInt(28) + 1);
        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};
        System.out.println(Arrays.toString(cats));

    }
}










