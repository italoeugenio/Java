package academy.italo.maratonajava.introducao;

import java.util.Scanner;
public class Aula05EstruturasCondicionais04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write your salary: ");
        double salary = scan.nextDouble();

        if(salary >= 0 && salary <= 34172){
            System.out.println("TAX per bracket: 9,70%");
        } else if(salary >= 34713 && salary <= 68507){
            System.out.println("TAX per bracket: 37,35%");
        } else if (salary >= 68508){
            System.out.println("TAX per bracket: 49,50%");
        } else {
            System.out.println("YOU ARE POOR");
        }
    }
}

