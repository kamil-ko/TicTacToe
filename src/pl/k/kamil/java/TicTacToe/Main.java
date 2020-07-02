package pl.k.kamil.java.TicTacToe;

import static pl.k.kamil.java.TicTacToe.Board.getPlayer;
import static pl.k.kamil.java.TicTacToe.PrintUtils.printBoard;


public class Main {

    public static void main(String[] args) {


        //definicja tablicy
        Board board = new Board(ScannerUtils.getFromScanner("Podaj rozmiar planszy"));

        //wybór znaku
        char player = getPlayer();

        // Gra
        boolean win = false;
        int movesCounter = 0;
        while (movesCounter < board.getBoard().length * board.getBoard().length && !win) {
            printBoard(board.getBoard());
            if (Move.moveLogic(board.getBoard(), player)) {
                movesCounter++;
                win = CheckWinner.checkWinner(board.getBoard(), player);
                player = player == 'O' ? 'X' : 'O';
            } else {
                System.out.println("Ruch nie poprawny sprbuj jeszcze raz: ");
            }

        }
        printBoard(board.getBoard());
        System.out.println("Koniec gry");

    }


}



