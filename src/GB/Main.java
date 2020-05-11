package GB;

public class Main {

    public static void main(String[] args) {

        byte aByte = 127;
    	short aShort = 2020;
    	int aInt = -120;
        long aLong = 9876543210L;
        float aFloat = 3.14159f;
        double aDouble = -3.1415926;
        char aChar = 'c';
        String aString = "String";
        boolean aBoolean = true;

        System.out.println(formula(30,20.2,8,4));   //3 задание
        System.out.println(interval(13,7));               //4 задание
        positiveNegative(0);                                 //5 задание
        System.out.println(negative(10));                    //6 задание
        name("Дюк");                                         //7 задание
        leapYear(aShort);                                       //8 задание
    }

    static double formula (double a, double b, double c, double d){
        return a * (b + c/d);
    }

    static boolean interval (int a, int b){   //Предполагается, что вводят только целые числа
        return (a + b <= 20 & a + b >= 10);
    }

    static void positiveNegative(int a){
        System.out.println("Число " + a + ((a<0)? " отрицательное" : " положительное"));
    }

    static boolean negative (int a){
        return a<0;
    }

    static void name (String a){
        System.out.println("Привет, " + a + "!");
    }

    static void leapYear (short a){
        System.out.println("Год " + a + ((a%400==0 || (a%4==0 && a%100!=0))? " високосный" : " не високосный"));
    }
}
