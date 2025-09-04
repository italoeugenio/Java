package academy.italo.maratonajava.javacore.ZZBcomportamento.test;

import academy.italo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.italo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> carList = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019),
            new Car("green", 2030)
    );


    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredList = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredList.add(car);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {
        //Classes anonimas
        List<Car> greeCars1 = filter(carList, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });

        List<Car> greeCars2 = filter(carList, car -> car.getColor().equals("green"));
        System.out.println(greeCars1);
        System.out.println(greeCars2);


    }
}
