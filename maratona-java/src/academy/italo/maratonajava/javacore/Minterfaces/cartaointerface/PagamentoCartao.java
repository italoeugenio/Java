package academy.italo.maratonajava.javacore.Minterfaces.cartaointerface;

public class PagamentoCartao implements PagamentoService {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com CARTÃO.");
    }
}