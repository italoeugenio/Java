package academy.italo.soffner.cap6;

public class Ex07 {
    public static void main(String[] args) {
        imprimirQuantidadeDeAsterisco(5);
    }

    public static void imprimirQuantidadeDeAsterisco(int quantidade){
        if(quantidade <= 0){
            System.out.println("Vazio");
        } else {
            for(int i = 0; i < quantidade; i++){
                System.out.print("*");
            }
        }
    }
}
