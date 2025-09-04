package academy.italo.jogodavelha.game1;

import java.util.Scanner;

public class Game {
    Player player1;
    Player player2;
    XorO[][] board;

    public Game() {
        board = new XorO[3][3];
    }

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public XorO chooseXorO() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHOOSE");
        System.out.println("1-(X)");
        System.out.println("2-(O)");
        System.out.print("Enter 1 or 2: ");
        int choose = scanner.nextInt();
        while (choose > 2 || choose < 1) {
            System.out.print("Please, enter a valid number: ");
            choose = scanner.nextInt();
        }
        if (choose == 1) return XorO.CHOOOSE_X;
        return XorO.CHOOOSE_O;
    }

    public Player playerInformations() {
        System.out.println("PLAYER");
        String name = enterName();
        XorO choose = chooseXorO();

        Player player = new Player(name, choose);

        System.out.println();
        System.out.println("---Player informations---");
        System.out.println(player);

        return player;
    }

    public void showBoard() {
        System.out.println("     0   1   2 ");
        System.out.println("   -------------");

        for (int i = 0; i < board.length; i++) {
            System.out.print(" " + i + " |");

            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null) {
                    System.out.print("   |");
                } else {
                    System.out.print(" " + board[i][j] + " |");
                }
            }

            System.out.println();
            System.out.println("   -------------");
        }
    }

    public void makeMove(Player player){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose the line ");
        Integer line =  scanner.nextInt();
        System.out.println();
        System.out.print("Choose the Column ");
        Integer column =  scanner.nextInt();



    }

    public void start() {
        this.player1 = playerInformations();
        this.player2 = playerInformations();

        if (player1.getChoose() == player2.getChoose()) {
            if (player1.getChoose() == XorO.CHOOOSE_X) {
                player2.setChoose(XorO.CHOOOSE_O);
            } else {
                player2.setChoose(XorO.CHOOOSE_X);
            }
        }
        System.out.println(player2.getName() + ", you can't have the same choose that " + player1 + ", so now you are " + player2.getChoose().getDescription());
    }

}


