package academy.italo.maratonajava.javacore.ZGenerics.test.teste;

import academy.italo.maratonajava.javacore.ZGenerics.test.domain.Car;
import academy.italo.maratonajava.javacore.ZGenerics.test.service.CarRentavelService;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        CarRentavelService carRentavelService = new CarRentavelService();
        Car car = carRentavelService.buscarCarroDisponivel();
        System.out.println("Usando carro por 1 mês...");
        carRentavelService.retornarCarroAlugado(car);
    }
}
