package academy.italo.maratonajava.javacore.Ycolecoes.dominio;

public class SmartPhone {
    private String serialNumber;
    private String marcar;

    public SmartPhone(String marcar, String serialNumber) {
        this.marcar = marcar;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        SmartPhone smartPhone = (SmartPhone) obj;
        return serialNumber != null && serialNumber.equals(smartPhone.serialNumber);
     }


    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marcar='" + marcar + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    public String getMarcar() {
        return marcar;
    }

    public void setMarcar(String marcar) {
        this.marcar = marcar;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
