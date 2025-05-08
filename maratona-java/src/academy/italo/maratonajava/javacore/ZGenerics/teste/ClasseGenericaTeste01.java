package academy.italo.maratonajava.javacore.ZGenerics.teste;

import academy.italo.maratonajava.javacore.ZGenerics.domain.Car;
import academy.italo.maratonajava.javacore.ZGenerics.service.CarRentavelService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        CarRentavelService carRentavelService = new CarRentavelService();
        Car car = carRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por 1 mês...");
        carRentavelService.retornarCarroAlugado(car);
    }
}
