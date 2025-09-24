package academy.italo.maratonajava.javacore.Aintroducaoclasses.howtousesuper;

public class Animal {
    protected String name;
    protected Integer age;

    public Animal() {}

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void  makeNoise(){
        System.out.println("Hello i'm an animal");
    }

    public void eat(){
        System.out.println("Much much");
    }


    protected void doSomethingPrivate(){
        System.out.println("This function is private");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
