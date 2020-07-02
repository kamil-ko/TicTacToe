package pl.k.kamil.java.TicTacToe.Utils;

public class Move {

    public static boolean moveLogic(char[][] board, char player) {
      int row = getRow(board,player);
      int column = getColumn(board,player);

        if (board[row-1][column-1] == ' ') {
        board[row-1][column-1] = player;
        return true;
        }
        else {
            return false;
        }


    }


    private static int getRow(char[][] board, char player) {
        int row = 0;
        while (true) {
            row = ScannerUtils.getFromScanner(player + " - podaj numer wiersza: ");
            if (row > 0 && row <= board.length) {
                return row;
            } else {

                System.out.println("Numer kolumny nie poprawny");
            }
        }
    }


    private static int getColumn(char[][] board, char player) {
        int column = 0;
        while (true) {
            column = ScannerUtils.getFromScanner(player + " - podaj numer kolumny: ");
            if (column > 0 && column <= board.length) {
                return column;
            } else {
                System.out.println("Numer kolumny nie poprawny");
            }
        }
    }








}







