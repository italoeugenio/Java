package academy.italo.maratonajava.javacore.Kenum.test;

import academy.italo.maratonajava.javacore.Kenum.dominio.Agente;
import academy.italo.maratonajava.javacore.Kenum.dominio.TiposDeAgente;

public class AgenteTest {
    public static void main(String[] args) {
        Agente ash = new Agente("Ash", TiposDeAgente.INTEL);
        System.out.println(ash);
    }
}
