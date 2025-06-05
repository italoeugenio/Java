package academy.italo.maratonajava.javacore.ZGenerics.generics;

import java.util.ArrayList;
import java.util.List;

class Pokemon {
    private String nome;

    public Pokemon(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nome='" + nome + '\'' + '}';
    }
}

class Pikachu extends Pokemon {
    public Pikachu(String nome) {
        super(nome);
    }

    public void usarChoqueDoTrovão() {
        System.out.println(getNome() + " usou Choque do Trovão!");
    }
}

class Charizard extends Pokemon {
    public Charizard(String nome) {
        super(nome);
    }

    public void voar() {
        System.out.println(getNome() + " está voando!");
    }
}

class Pokebola<T extends Pokemon> {
    private T pokemon;

    public Pokebola(T pokemon) {
        this.pokemon = pokemon;
    }

    public void capturar(T p) {
        this.pokemon = p;
        System.out.println("Um " + p.getNome() + " foi capturado!");
    }

    public T liberar() {
        System.out.println("Um " + pokemon.getNome() + " foi liberado!");
        return pokemon;
    }

    public T getPokemon() {
        return pokemon;
    }

    public void setPokemon(T pokemon) {
        this.pokemon = pokemon;
    }
}

public class MainPokemon {
    public static void main(String[] args) {
        // Exemplo básico de Generics
        Pikachu meuPikachu = new Pikachu("Pikachu");
        Pokebola<Pikachu> pokebolaPikachu = new Pokebola<>(meuPikachu);

        Pikachu pikachuLiberado = pokebolaPikachu.liberar();
        System.out.println("Liberado: " + pikachuLiberado.getNome());

        System.out.println("----");

        Charizard meuCharizard = new Charizard("Charizard");
        Pokebola<Charizard> pokebolaCharizard = new Pokebola<>(meuCharizard);

        Charizard charizardLiberado = pokebolaCharizard.liberar();
        System.out.println("Liberado: " + charizardLiberado.getNome());

        System.out.println("==== Exemplos com Wildcards ====");

        // Lista de Pokebolas de qualquer tipo
        List<Pokebola<?>> pokebolas = new ArrayList<>();
        pokebolas.add(pokebolaPikachu);
        pokebolas.add(pokebolaCharizard);

        // Método com wildcard upper bounded (? extends)
        liberarTodosOsPokemons(pokebolas);

        // Método com wildcard lower bounded (? super)
        List<Pokebola<Pokemon>> pokebolasDePokemon = new ArrayList<>();
        adicionarPokebola(pokebolasDePokemon, new Pokebola<>(new Pikachu("Pikachu 2")));
        adicionarPokebola(pokebolasDePokemon, new Pokebola<>(new Charizard("Charizard 2")));

        System.out.println("----");

        // Exemplo com métodos que usam os Pokémon
        List<Pikachu> pikachus = new ArrayList<>();
        pikachus.add(new Pikachu("Pikachu 3"));
        pikachus.add(new Pikachu("Pikachu 4"));

        usarHabilidades(pikachus);
    }

    // Método com upper bounded wildcard (? extends)
    // Aceita Pokebola de qualquer tipo que seja subtipo de Pokemon
    public static void liberarTodosOsPokemons(List<? extends Pokebola<?>> pokebolas) {
        System.out.println("\nLiberando todos os Pokémon:");
        for (Pokebola<?> pokebola : pokebolas) {
            Pokemon p = pokebola.liberar();
            System.out.println("Pokémon liberado: " + p.getNome());
        }
    }

    // Método com lower bounded wildcard (? super)
    // Aceita Pokebola de Pokemon ou qualquer supertipo (neste caso só Object)
    public static void adicionarPokebola(List<? super Pokebola<Pokemon>> lista, Pokebola<Pokemon> pokebola) {
        lista.add(pokebola);
        System.out.println("Pokébola adicionada contendo: " + pokebola.getPokemon().getNome());
    }

    // Método que demonstra ? extends em uma lista de Pokémon
    public static void usarHabilidades(List<? extends Pikachu> pikachus) {
        System.out.println("\nUsando habilidades dos Pikachus:");
        for (Pikachu p : pikachus) {
            p.usarChoqueDoTrovão();
        }
    }

    // Método que demonstra ? super em uma lista de Pokémon
    public static void adicionarPikachus(List<? super Pikachu> lista) {
        lista.add(new Pikachu("Pikachu novo"));
        System.out.println("Novo Pikachu adicionado à lista");
    }
}