package academy.italo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioCorrecao {
    public String nome;
    public int idade;
    public double[] salarios;

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
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media = media / salarios.length;
        System.out.printf("\nMédia salarial: %.2f%n", media);
    }
}
