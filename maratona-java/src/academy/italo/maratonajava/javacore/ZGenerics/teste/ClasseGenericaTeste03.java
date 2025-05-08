 package academy.italo.maratonajava.javacore.ZGenerics.teste;

import academy.italo.maratonajava.javacore.ZGenerics.domain.Boat;
import academy.italo.maratonajava.javacore.ZGenerics.domain.Car;
import academy.italo.maratonajava.javacore.ZGenerics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

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
