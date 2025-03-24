package academy.italo.maratonajava.javacore.Minterfaces.cartaointerface;

public class PagamentoPix implements PagamentoService {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com PIX.");
    }
}
