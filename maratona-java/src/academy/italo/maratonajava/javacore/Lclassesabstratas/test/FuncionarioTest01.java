package academy.italo.maratonajava.javacore.Lclassesabstratas.test;

import academy.italo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.italo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nani", 5000);
        System.out.println(gerente);

        Desenvolvedor devenvolvedor = new Desenvolvedor("Ítalo", 12000);
        System.out.println(devenvolvedor);

        gerente.imprime();
        devenvolvedor.imprime();

    }
}
