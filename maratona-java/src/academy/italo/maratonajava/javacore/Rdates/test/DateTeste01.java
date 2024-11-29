package academy.italo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000_0L); //Trabalha com milissegundo (long) 01/01/1970
        Date date1 = new Date();

        System.out.println(date);
        System.out.println(date.getTime());

        System.out.println(date1);

    }
}
