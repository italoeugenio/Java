package academy.italo.maratonajava.javacore.Kenum.test;

import academy.italo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.italo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Camilla", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akio",TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente2);

    }
}
