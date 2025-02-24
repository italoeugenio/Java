package academy.italo.maratonajava.singleton.domain;

public class Pessoa {
    private static Pessoa instance;
    private String name;

    private Pessoa() {
    }

    public static Pessoa getInstance() {
        if (Pessoa.instance == null) {
            Pessoa.instance = new Pessoa();
        }
        return Pessoa.instance;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }
}
