package academy.italo.maratonajava.javacore.Aintroducaoclasses.modificadores.privates;

public class PrivateTest {
    private String privateName = "privateName";
    protected String protectString = "protectString";

    public PrivateTest(String privateName, String protectString) {
        this.privateName = privateName;
        this.protectString = protectString;
    }

    public String getPrivateName() {
        return privateName;
    }

    public void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    public String getProtectString() {
        return protectString;
    }

    public void setProtectString(String protectString) {
        this.protectString = protectString;
    }

    public void imprimir(){
        System.out.println(this.protectString);
    }
}
