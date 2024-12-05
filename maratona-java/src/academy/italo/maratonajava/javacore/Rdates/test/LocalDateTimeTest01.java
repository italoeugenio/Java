package academy.italo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2022, Month.AUGUST,6);
        LocalDate dateParse = LocalDate.parse("2022-02-06");
        LocalTime time = LocalTime.of(9,45,21);
        LocalTime timeParse = LocalTime.parse("09:45:00");

        LocalDateTime ldt1 = date.atTime(timeParse);
        LocalDateTime ldt2 = date.atTime(12,15,50);

        System.out.println(ldt2);
    }
}
