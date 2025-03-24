package academy.italo.maratonajava.introducao;

public class OperadorTernario {
    public static void main(String[] args) {
        //Ex01
        int num1 = 10;
        int num2 = 13;

        int maxNum = (num1 > num2) ? num1 : num2;

        System.out.println(maxNum);

        //Ex02
        String oddOrEven = (num1 % 2 == 0) ? "Even" : "Odd";
        System.out.println(oddOrEven);

        //Ex03
        int age = 18;
        String canEnter = (age >= 18) ? "You can enter" : "You can´t enter";
        System.out.println(canEnter);

        //Ex07
        int number = -15;
        String ex07 = (number == 0) ? "Zero" : (number > 0) ? "Positive" : " Negative";

    }
}
