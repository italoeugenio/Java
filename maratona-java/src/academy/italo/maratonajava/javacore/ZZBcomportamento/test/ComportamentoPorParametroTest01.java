package academy.italo.maratonajava.javacore.ZZBcomportamento.test;

import academy.italo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> filtarPorCor(List<Car> car, String color){
        List<Car> listaFiltrada = new ArrayList<>();
        for(int i = 0; i < car.size(); i++){
            Car currentCar = car.get(i);
            if(currentCar.getColor().equals(color)){
                listaFiltrada.add(currentCar);
            }
        }

        return  listaFiltrada;
    }

    public static void main(String[] args) {
        List<Car> carList = List.of(
                new Car("gree", 2011),
                new Car("black", 1998),
                new Car("red", 2019)
                );


     }
}
