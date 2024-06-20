package academy.italo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioCorrecao {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            System.out.println("----------------------");
            //return dentro de um método funciona como um break
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }
        mediaDosSalarios();
        System.out.println("----------------------");
    }

    private void mediaDosSalarios() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;
        System.out.printf("\nMédia salarial: %.2f%n", media);
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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
