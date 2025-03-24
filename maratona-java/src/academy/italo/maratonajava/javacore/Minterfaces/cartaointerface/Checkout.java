package academy.italo.maratonajava.javacore.Minterfaces.cartaointerface;

public class Checkout {
    private PagamentoService pagamentoService;

    public Checkout(PagamentoService pagamentoService){
        this.pagamentoService = pagamentoService;
    }

    public void finalizarCompra(double valor) {
        pagamentoService.processarPagamento(valor);
        System.out.println("Compra finalizada com sucesso!");
    }
}
