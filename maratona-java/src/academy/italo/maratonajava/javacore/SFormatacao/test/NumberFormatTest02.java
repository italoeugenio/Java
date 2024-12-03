package academy.italo.maratonajava.javacore.SFormatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        NumberFormat[] nfa = new NumberFormat[2];
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        nfa[0] =  NumberFormat.getCurrencyInstance(localeJP);
        nfa[1] =  NumberFormat.getCurrencyInstance(localeIT);

        double valor = 10_000.2130;

        for(NumberFormat numberFormat: nfa){
            System.out.println(numberFormat.format(valor));
        }
    }
}