package academy.italo.maratonajava.javacore.Aintroducaoclasses.howtousesuper;

public class Cat extends Animal{
    private String catFoodPreference;

    public Cat(String name, Integer age, String catFoodPreference){
        super(name,age);
        this.catFoodPreference = catFoodPreference;
    }

    public Cat(String name, Integer age){
        super(name,age);
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("miauuuu ");
        eat();
        doSomethingPrivate();
    }

    public void jump(){
        System.out.println("i am jumping");
    }
}
