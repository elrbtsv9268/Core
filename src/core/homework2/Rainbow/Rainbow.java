package HW2.Rainbow;

import java.util.Scanner;

import static HW2.Main.Main.scanner;

public class Rainbow {
    private static final Scanner scanner = new Scanner(System.in);
    public static final int BASIC_COLOR_RED = 1;
    public static final int BASIC_COLOR_ORANGE = 2;
    public static final int BASIC_COLOR_YELLOW = 3;
    public static final int BASIC_COLOR_GREEN = 4;
    public static final int BASIC_COLOR_BLUE = 5;
    public static final int BASIC_COLOR_INDIGO = 6;
    public static final int BASIC_COLOR_VIOLET = 7;
    public static final int MIXED_COLOR_RED_ORANGE = 12;
    public static final int MIXED_COLOR_ORANGE_YELLOW = 23;
    public static final int MIXED_COLOR_YELLOW_GREEN = 34;
    public static final int MIXED_COLOR_GREEN_BLUE = 45;
    public static final int MIXED_COLOR_BLUE_INDIGO = 56;
    public static final int MIXED_COLOR_INDIGO_VIOLET = 67;
    public static int color;

    public void start() {

        System.out.print(" Введите  число: ");
        int color = scanner.nextInt();
        if (color == 1) {
            System.out.println("Красный цвет");
        } else if (color == 2) {
            System.out.println("Оранжевый цвет");
        } else if (color == 3) {
            System.out.println("Желтый цвет");
        } else if (color == 4) {
            System.out.println("Зеленый цвет");
        } else if (color == 5) {
            System.out.println("Голубой цвет");
        } else if (color == 6) {
            System.out.println("Синий цвет");
        } else if (color == 7) {
            System.out.println("Фиолетовый цвет");
        } else if (color == 12) {
            System.out.println("Красно-оранжевый цвет");
        } else if (color == 23) {
            System.out.println("Оранжево-желтый цвет");
        } else if (color == 34) {
            System.out.println("Желто-зеленый цвет");
        } else if (color == 45) {
            System.out.println("Зелено-голубой цвет");
        } else if (color == 56) {
            System.out.println("Сине-голубой цвет");
        } else if (color == 67) {
            System.out.println("Сине-фиолетовый цвет");
        } else {
            System.out.println("Число не соответствует цвету радуги ");
        }


        System.out.print(" Введите  число: ");
        int color1 = scanner.nextInt();
        printColor(color1);
    }
        public static void printColor(int color1) {
            switch (color1) {
                case 1: {
                    System.out.println("Красный цвет");
                    break;
                }
                case 2: {
                    System.out.println("Оранжевый цвет");
                    break;
                }
                case 3: {
                    System.out.println("Желтый цвет");
                    break;
                }
                case 4: {
                    System.out.println("Зеленый цвет");
                    break;
                }
                case 5: {
                    System.out.println("Голубой цвет");
                    break;
                }
                case 6: {
                    System.out.println("Синий цвет");
                    break;
                }
                case 7: {
                    System.out.println("Фиолетовый цвет");
                    break;
                }
                case 12: {
                    System.out.println("Красно-оранжевый цвет");
                    break;
                }
                case 23: {
                    System.out.println("Оранжево-желтый цвет");
                    break;
                }
                case 34: {
                    System.out.println("Желто-зеленый цвет");
                    break;
                }
                case 45: {
                    System.out.println("Зелено-голубой цвет");
                    break;
                }
                case 56: {
                    System.out.println("Сине-голубой цвет");
                    break;
                }
                case 67: {
                    System.out.println("Сине-фиолетовый цвет");
                    break;
                }
                default: {
                    System.out.println("Число не соответствует цвету радуги ");
                }
            }
        }
    }
