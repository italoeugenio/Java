package academy.italo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public float[] salario = new float[3];

    public void imprimirDados(Funcionario funcionario){
        System.out.println("----------------------");
        System.out.println("Dados do funcionário");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println("SALÁRIOS:");
        System.out.println();
        for (float numeros: this.salario){
            System.out.println(numeros);
        }
        System.out.println("----------------------");
    }

    public float mediaDoSalario(float[] salarios){
        float soma = 0;
        for(float numeros : salarios){
            soma += numeros;
        }
        return soma/salarios.length;
    }
}
