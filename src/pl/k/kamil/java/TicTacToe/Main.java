package pl.k.kamil.java.TicTacToe;


public class Main {

    public static void main(String[] args) {


        //definicja tablicy
        int size = ScannerUtils.getFromScanner("Podaj rozmiar planszy");
        char[][] board = new char[size][size];
        //wypełnienie tablicy
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }

        //wybór znaku
        char player;
        if (ScannerUtils.getFromScanner("Wybierz czym chcesz grać 1:kółko , 2:krzyżyk ") == 1) {
            player = 'O';
        } else {
            player = 'X';
        }



        // Gra

        boolean win = false;
        int movesCounter = 0;
        while (movesCounter< board.length * board.length && !win){
            PrintUtils.printBoard(board);
            if(Move.moveLogic(board,player)) {
                movesCounter++;
                win = CheckWinner.checkWinner(board,player);
                player = player == 'O' ? 'X' : 'O';
            }
            else {
                System.out.println("Ruch nie poprawny sprbuj jeszcze raz: ");
            }

        }
        PrintUtils.printBoard(board);
        System.out.println("Koniec gry");

    }


}


