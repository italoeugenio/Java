package academy.italo.maratonajava.Jmodificadorfinal.test;

import academy.italo.maratonajava.Jmodificadorfinal.domain.Carro;
import academy.italo.maratonajava.Jmodificadorfinal.domain.Comprador;
import academy.italo.maratonajava.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Ítalo");
        System.out.println(carro.COMPRADOR);

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro1.COMPRADOR.setNome("Édrick");
        System.out.println(carro1.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
