package academy.italo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2022, Month.JANUARY,27);
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
    }
}
