package academy.italo.maratonajava.javacore.ZGenerics.test.service;

import academy.italo.maratonajava.javacore.ZGenerics.test.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentavelService {
    private List<Car> carList = new ArrayList<>(
            List.of(new Car("BWM"),
                    new Car("Mercedes")));

    @Override
    public String toString() {
        return "CarRentavelService{" +
                "carList=" + carList +
                '}';
    }

    public Car buscarCarroDisponivel() {
        System.out.println("Buscando carro");
        Car car = carList.remove(0);
        System.out.println("Alugando carro " + car);
        System.out.println("Carros disponíveis para alugar:  ");
        System.out.println(carList);
        return car;
    }

    public void retornarCarroAlugado(Car car){
        System.out.println("Devolvendo carro " + car);
        carList.add(car);
        System.out.println("Carros disponíveis");
        System.out.println(carList);
    }
}
