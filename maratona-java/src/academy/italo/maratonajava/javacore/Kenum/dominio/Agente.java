package academy.italo.maratonajava.javacore.Kenum.dominio;

public class Agente {
    private String nome;
    private TiposDeAgente tiposDeAgente;

    public Agente(String nome, TiposDeAgente tiposDeAgente) {
        this.nome = nome;
        this.tiposDeAgente = tiposDeAgente;
    }

    @Override
    public String toString() {
        return "Agente{" +
                "nome='" + nome + '\'' +
                ", tiposDeAgente=" + tiposDeAgente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TiposDeAgente getTiposDeAgente() {
        return tiposDeAgente;
    }

    public void setTiposDeAgente(TiposDeAgente tiposDeAgente) {
        this.tiposDeAgente = tiposDeAgente;
    }
}
