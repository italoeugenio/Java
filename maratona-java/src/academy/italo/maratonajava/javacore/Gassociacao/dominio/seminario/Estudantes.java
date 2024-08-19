package academy.italo.maratonajava.javacore.Gassociacao.dominio.seminario;

public class Estudantes {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Estudantes(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
        this.seminario = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
