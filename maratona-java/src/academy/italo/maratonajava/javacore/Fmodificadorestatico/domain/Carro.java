package academy.italo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    //Perte a todos o objetos de forma única e nao para cada instancia e sim para o objeto geral.
    public static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-------------------");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Veolicade Limite: "+ Carro.velocidadeLimite);
        System.out.println("Veolicade MAxima: "+this.velocidadeMaxima);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}
