package academy.italo.maratonajava.javacore.Lclassesabstratas.dominio;

public class SerVivo {
    protected int idade;

    public SerVivo(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

//    public abstract void respirar();

    public void dormir(){
        System.out.println("dormindo...");
    }
}
