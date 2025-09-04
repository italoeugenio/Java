package academy.italo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.italo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface LambdaInterface {
    // funções anonimas, serve para diminuir a quantidade de código
    boolean test(Car car);
    //(parametro) -> <expressao>
    //(Car car) -> car.get.Color().equals("green");
}
