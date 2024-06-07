package Lesson3;

import java.util.Scanner;

public class Main {


    public static  void switchChanel() {
        System.out.println("Канал переключен");
    }

    private static int x;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(x);
        switchChanel();


        System.out.println(" Введите первое число: ");
        String x = scanner.nextLine();
        System.out.println(" Введите второе число: ");
        String y = scanner.nextLine();
        int number = sum(x,y);
        System.out.println("Результат сложения: " + number);

        int month = 10;
        System.out.println(month);
    }
    public static int sum(String x, String y) {
     int value1 = Integer.parseInt(x);
     int value2 = Integer.parseInt(y);
      return value1 + value2;
    }

    public static void printMonth(int x){
        switch (x) {
            case 1 : {
                System.out.println("Январь");
                break;

            } case 2 : {
                System.out.println("Февраль");
                break;
            }
            case 3 : {
                System.out.println("Март");
                break;
            }
            default: {
                System.out.println();



            }
        }

        }

    }




