package academy.italo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // + - / * (Arithmetic)
        double num1 = 3;
        int num2 = 20;
        double division = num1 / num2;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(division);
        System.out.println(num1 * num2);

        // % (Remainder)
        System.out.println("\nRemainder:");
        System.out.println(num2 % num1);

        // < > <= >= == !=
        boolean isTenIsGreaterThanTwenty = 10 > 20;
        boolean isTenIsLesserThanTwenty = 10 < 20;
        boolean isTenIsEqualsThanTwenty = 10 == 20;
        boolean isTenIsEqualsThanTen = 10 == 10;
        System.out.println("\nisTenIsGreaterThanTwenty " + isTenIsGreaterThanTwenty);
        System.out.println("isTenIsLesserThanTwenty " + isTenIsLesserThanTwenty);
        System.out.println("isTenIsEqualsThanTwenty " + isTenIsEqualsThanTwenty);
        System.out.println("isTenIsEqualsThanTen " + isTenIsEqualsThanTen);

        // AND(&&), OR(||), NOT(!)
        int age = 29;
        float salary = 3500.F;
        boolean isInsideLawAndGreaterThirty = age >= 30 && salary >= 4612;
        boolean isInsideLawAndLesserThirty = age < 30 && salary >= 3381;

        System.out.println("\nisInsideLawAndGreaterThirty " + isInsideLawAndGreaterThirty);
        System.out.println("isInsideLawAndLesserThirty " + isInsideLawAndLesserThirty);

        // Assignment = += -= *= /= %=
        int a = 10;
        int b = 5;

        // Assignment operator (=)
        int c = a;  // c gets the value of a, which is 10

        // Compound assignment operators
        c += b; // Equivalent to: c = c + b;
        System.out.println("\nc += b: " + c); // Should print 15

        c -= b; // Equivalent to: c = c - b;
        System.out.println("c -= b: " + c); // Should print 10

        c *= b; // Equivalent to: c = c * b;
        System.out.println("c *= b: " + c); // Should print 50

        c /= b; // Equivalent to: c = c / b;
        System.out.println("c /= b: " + c); // Should print 10

        c %= b; // Equivalent to: c = c % b;
        System.out.println("c %= b: " + c); // Should print 0

        // ++ --

        // Post-increment operator (count++)
        int count = 5;
        System.out.println("\nPost-increment:");
        System.out.println("Original count: " + count); // Should print 5
        System.out.println("After count++: " + count++); // Should print 5
        System.out.println("Final count value: " + count); // Should print 6

        // Post-decrement operator (count--)
        System.out.println("\nPost-decrement:");
        System.out.println("Original count: " + count); // Should print 6
        System.out.println("After count--: " + count--); // Should print 6
        System.out.println("Final count value: " + count); // Should print 5

        // Pre-increment operator (++count)
        System.out.println("\nPre-increment:");
        count = 5; // Reset count
        System.out.println("Original count: " + count); // Should print 5
        System.out.println("After ++count: " + ++count); // Should print 6
        System.out.println("Final count value: " + count); // Should print 6

        // Pre-decrement operator (--count)
        System.out.println("\nPre-decrement:");
        System.out.println("Original count: " + count); // Should print 6
        System.out.println("After --count: " + --count); // Should print 5
        System.out.println("Final count value: " + count); // Should print 5
    }
}
