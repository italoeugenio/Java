package academy.italo.soffner.cap6;

public class Ex03 {
    public static int fatorial(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
          return (n * fatorial(n - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(fatorial(0));
    }
}
