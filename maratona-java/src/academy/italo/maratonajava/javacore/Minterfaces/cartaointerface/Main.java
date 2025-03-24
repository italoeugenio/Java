package academy.italo.maratonajava.javacore.Minterfaces.cartaointerface;

public class Main {
    public static void main(String[] args) {
        // Criando um Checkout com pagamento via Cartão
        Checkout checkout1 = new Checkout(new PagamentoCartao());
        checkout1.finalizarCompra(150.00);

        System.out.println("------------");

        // Criando um Checkout com pagamento via Pix
        Checkout checkout2 = new Checkout(new PagamentoPix());
        checkout2.finalizarCompra(200.00);

        Checkout checkout3 = new Checkout(new PagamentoCartao());
        checkout3.finalizarCompra(123);
    }
}
