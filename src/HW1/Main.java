package HW1;

import java.util.UUID;

public class Main {
//    Примитивные типы данных
    static byte b = -128;
    static short s = 32767;
    static int i = 2147483647;
    static long l = -9_223_372_036_854_775_808L;
    static float f  = -3.40028230000023f;
    static double d = 1.79769313486231570307;
    static char aChar = 'q';
    static boolean isTrue = true;

//    Ссылочные типы данных
    static String str = "Hello World";
    static Byte num1 = 127;
    static Short num2 = -32768;
    static Integer num3 = 9999;
    static Long num4 = 8_645_234_397_386L;
    static Float num5;
    static Double num6;

    public static void main(String[] args) {
        int z = 89098877;
        Integer number = 35;
//  локальная переменная типа var
        var b = -128;
        var s = 32767;
        var i = 2147483647;
        var l = -9_223_372_036_854_775_808L;
        var f  = -3.40028230000023f;
        var d = 1.79769313486231570307;
        var aChar = 'q';

        UUID uuid = UUID.randomUUID();
        s = b;
        i = s;
        l = i;
        d = f;
        //        Приведение типов
        s = (short) i;
        b =(byte) i;
        i = (int) l;
        f = (float) d;
        String str1 = "10";
        int x = Integer.parseInt(str1);
        String newStr = String.valueOf(b);
        Integer number1 = Integer.valueOf(newStr);
        System.out.println("number  " +  number1);

//    К оболочкам применимы методы, например:
        System.out.println(str.toUpperCase());
        System.out.println(num3.doubleValue());
        System.out.println(str.length());

//      Вывод на консоль
        System.out.println("x = " + x);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("aChar = " + aChar);
        System.out.println("isTrue = " + isTrue);
        System.out.println("d = " + d);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println(uuid);

        Student student1 = new Student();
        student1.setName("Алина");
        System.out.println("Имя студента " + student1.getName());

        student1.setMark(8);
        System.out.println("Отметка студента " + student1.getMark());


    }

}


