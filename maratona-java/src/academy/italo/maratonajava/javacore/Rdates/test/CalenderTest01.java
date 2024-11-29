package academy.italo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        if(calendar.getFirstDayOfWeek() == calendar.SUNDAY){
            System.out.println("Domingo é o prmeiro dia da semana");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.HOUR, 12);
        calendar.roll(Calendar.HOUR, 12);
        System.out.println(date);
        System.out.println(calendar);
    }
}
