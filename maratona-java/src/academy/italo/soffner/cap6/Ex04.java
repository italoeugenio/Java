package academy.italo.soffner.cap6;

public class Ex04 {
    public static double areaDoCirculo(float raio){
        return Math.pow(raio, 2) * Math.PI;
    }

    public static void main(String[] args) {
        System.out.println(areaDoCirculo(10));
    }
}
