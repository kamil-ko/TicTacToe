package pl.k.kamil.java.TicTacToe;

public class Board {

    private char[][] board;


    public Board(int size) {
        initBoard(size);
    }

    public static char getPlayer() {
        char player;
        if (ScannerUtils.getFromScanner("Wybierz czym chcesz grać 1:kółko , 2:krzyżyk ") == 1) {
            player = 'O';
        } else {
            player = 'X';
        }
        return player;
    }

    private void initBoard(int size) {
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }

        }
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }
}
