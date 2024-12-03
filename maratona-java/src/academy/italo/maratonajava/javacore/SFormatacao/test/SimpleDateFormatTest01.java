package academy.italo.maratonajava.javacore.SFormatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy 'às' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        try {
            System.out.println(sdf.parse("03/12/2024 às 15:45:00 BRST"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
