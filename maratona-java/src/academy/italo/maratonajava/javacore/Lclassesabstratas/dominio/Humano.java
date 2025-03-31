package academy.italo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Humano extends SerVivo {
    public Humano() {
        super(42);
    }

    public void respirar() {
        System.out.println(this.idade);
        System.out.println("Inalando CO2 e Oxigênio");
    }
}
