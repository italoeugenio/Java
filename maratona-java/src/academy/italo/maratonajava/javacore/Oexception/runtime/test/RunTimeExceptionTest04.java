package academy.italo.maratonajava.javacore.Oexception.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e ){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }

        try{
            tavezLanceException();
        }catch (SQLException | FileNotFoundException throwables){
            throwables.printStackTrace();
        }
    }

    private static void tavezLanceException() throws SQLException, FileNotFoundException{

    }
}
