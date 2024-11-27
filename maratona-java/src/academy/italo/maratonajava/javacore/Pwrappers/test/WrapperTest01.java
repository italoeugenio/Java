package academy.italo.maratonajava.javacore.Pwrappers.test;

import java.util.ArrayList;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        float floatP = 1F;
        long longP = 1L;
        double doubleP = 1D;
        char charP = 'W';
        boolean booleanP = false;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; //autoboxing
        Float floatW = 1F;
        Long longW = 1L;
        Double doubleW = 1D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        Integer intW3 = Integer.parseInt("2");
        boolean verdadeiro = Boolean.parseBoolean("True");


        System.out.println(verdadeiro);
        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('!'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
