package academy.italo.maratonajava.javacore.ZGenerics.service;

import java.util.List;

public class RentavelService<T> {
    private List<T> objetosDisponiveis;

    public RentavelService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

     public T buscarObjetoDisponivel() {
        System.out.println("Buscando carro");
        T car = objetosDisponiveis.remove(0);
        System.out.println("Alugando carro " + car);
        System.out.println("Carros disponíveis para alugar:  ");
        System.out.println(objetosDisponiveis);
        return car;
    }

    public void retornarObjetoAlugado(T t) {
        System.out.println("Devolvendo carro " + t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponíveis");
        System.out.println(objetosDisponiveis);
    }

    @Override
    public String toString() {
        return "RentavelService{" +
                "objetosDisponiveis=" + objetosDisponiveis +
                '}';
    }
}

