package academy.italo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaULtil implements TemporalAdjuster{

    @Override
    public Temporal adjustInto(Temporal temporal) {
        return null;
    }
}

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now()
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(now);
        System.out.println(localDateTime);
    }
}
