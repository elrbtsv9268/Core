package HW1;

public class Main {
    static byte b = -128;
    static short s = 32767;
    static int i = 2147483647;
    static long l = -9_223_372_036_854_775_808L;
    static float f  = -3.40028230000023f;
    static double d = 1.79769313486231570307;
//    char c = 'q';
//    boolean isOk = true;
    static String str = "Hello World";
//   var e  = 3.4;

    static Byte num1 = 127;
    static Short num2 = -32768;
    static Integer num3 = 9999;
    static Long num4 = 8_645_234_397_386L;
    static Float num5;
    static Double num6;

    public static void main(String[] args) {
        int y = 73;

        String str1 = "10";
        int x = Integer.parseInt(str1);

        System.out.println(str.toUpperCase());
        System.out.println(num3.doubleValue());

        System.out.println("x = " + x);
        System.out.println("b = " + b);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
//        System.out.println("c = ");
//        System.out.println("isOk = ");
        System.out.println("d = " + d);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

        Student student1 = new Student();
        student1.setName("Алина");
        student1.setMark(8);
        student1.getName();
        student1.getMark();
        System.out.println();
        System.out.println("Имя студента " + student1.getName());
        System.out.println("Отметка студента " + student1.getMark());
    }

}


