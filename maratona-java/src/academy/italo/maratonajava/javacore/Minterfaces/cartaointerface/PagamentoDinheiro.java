package academy.italo.maratonajava.javacore.Minterfaces.cartaointerface;

public class PagamentoDinheiro implements PagamentoService {
    @Override
    public void processarPagamento(double valor){
        System.out.println("Valor do pagamento com dinheiro: " + valor);
    }

}
