package academy.italo.maratonajava.javacore.SFormatacao.test;

import java.util.Arrays;
import java.util.Locale;

public class LocalTeste02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountry = Locale.getISOCountries();
        String[] isoLanguage = Locale.getISOCountries();

        for(String isoLanguages: isoLanguage){
            System.out.print(isoLanguages + " ");
        }
        System.out.println();

        for(String isoCountries: isoCountry){
            System.out.print(isoCountries + " ");
        }
    }
}
