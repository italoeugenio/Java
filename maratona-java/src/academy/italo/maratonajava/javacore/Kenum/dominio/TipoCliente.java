package academy.italo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private int valor;

    TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getVALOR() {
        return valor;
    }
}
