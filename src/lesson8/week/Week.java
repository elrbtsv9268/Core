package lesson8.week;

import java.util.Scanner;

public class Week {
    private static final Scanner scanner = new Scanner(System.in);
    public static int day;

    public void start() {


        System.out.print(" Введите  число: ");
        int day = scanner.nextInt();
        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятница");
        } else if (day == 6) {
            System.out.println("Выходной");
        } else if (day == 7) {
            System.out.println("Выходной");
        } else {
            System.out.println("Число не относится к дню недели");
        }
    }


//    public class Task053 {
//        public static void main(String[] args) {
//            String str = "sfdFАSsdfs sfdSFфвыВфвФФdsdfs dsВВfS";
//            System.out.println(getLowerCaseString(str));
//        }
//
//        private static String getLowerCaseString(String str) {
//            StringBuffer sb = new StringBuffer();
//            if (str != null) {
//                for (char symbol : str.toCharArray()) {
//                    if (symbol >= 'А' && symbol <= 'Я') {
//                        symbol = Character.toLowerCase(symbol);
//                    }
//                    sb.append(symbol);
//                }
//            }
//            return sb.toString();
//        }
}

