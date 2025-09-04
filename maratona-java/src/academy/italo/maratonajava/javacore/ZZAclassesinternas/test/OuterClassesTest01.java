package academy.italo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "MOnkey D. Luffy";

    class Inner {
        public void printOuterClassAtribute() {
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAtribute();
    }
}
