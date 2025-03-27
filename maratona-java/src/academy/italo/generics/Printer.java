package academy.italo.generics;

public class Printer<T> {
    private T value;

    public Printer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void printerSomething(){
        System.out.println(value);
    }
}
