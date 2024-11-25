package academy.italo.maratonajava.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked - Precisa fazer o tratamento, pois o código não compila
        // Unchecked - Não precisa fazer um tratamento
        Object object = null;

        int[] nums = {1,2};
        System.out.println(nums[2]);
        System.out.println(object.toString());
    }
}
