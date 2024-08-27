package academy.italo.maratonajava.javacore.Kenum.test;

import academy.italo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.italo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.italo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Camilla", TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akio",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
    }
}
