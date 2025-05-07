 package academy.italo.maratonajava.javacore.ZGenerics.test.teste;

import academy.italo.maratonajava.javacore.ZGenerics.test.domain.Boat;
import academy.italo.maratonajava.javacore.ZGenerics.test.domain.Car;
import academy.italo.maratonajava.javacore.ZGenerics.test.service.CarRentavelService;
import academy.italo.maratonajava.javacore.ZGenerics.test.service.RentavelService;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

 public class ClasseGenericaTeste03 {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>(List.of(new Car("BMW"), new Car("Merceder")));
        List<Boat> boatLsit = new ArrayList<>(List.of(new Boat("Barco de luxo"), new Boat("Barco verde")));

        RentavelService<Car> rentavelService1 = new RentavelService<>(carList);
        RentavelService< Boat> rentavelService2 = new RentavelService<>(boatLsit);

        System.out.println(rentavelService1);
        System.out.println(rentavelService2);
    }
}
