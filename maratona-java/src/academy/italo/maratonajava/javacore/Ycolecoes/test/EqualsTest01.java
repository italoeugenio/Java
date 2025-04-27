package academy.italo.maratonajava.javacore.Ycolecoes.test;

import academy.italo.maratonajava.javacore.Ycolecoes.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("123", "Iphone ");
        SmartPhone s2 = new SmartPhone("123", "Iphone ");

        System.out.println(s1.equals(s2 ));

    }
}
