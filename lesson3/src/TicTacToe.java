import java.util.Scanner;

public class TicTacToe {
    private static char[][] board;
    private static char currentPlayer;
    private static char previousPlayer;
    private static boolean isGameOver;

    public static void main(String[] args) {
        board = new char[4][4];
        currentPlayer = 'X';
        previousPlayer = ' ';
        isGameOver = false;

        initializeBoard();

        while (!isGameOver) {
            displayBoard();
            makeMove();
            checkWinCondition();
            switchPlayer();
        }
        displayBoard();
        System.out.println("Player " + previousPlayer + " wins!");
    }

    private static void initializeBoard() {
        for (int row = 1; row < 4; row++) {
            for (int column = 1; column < 4; column++) {
                board[row][column] = ' ';
            }
        }
    }

    private static void displayBoard() {
        for (int row = 1; row < 4; row++) {
            for (int column = 1; column < 4; column++) {
                System.out.print(board[row][column]);
                if (column != 3) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (row != 3) {
                System.out.println("---------");
            }
        }
        System.out.println();
    }

    private static void makeMove() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player " + currentPlayer + ", enter your move (row, column):");

        int row = scanner.nextInt();
        int column = scanner.nextInt();

        if (isValidMove(row, column)) {
            board[row][column] = currentPlayer;
        } else {
            System.out.println("Invalid move! Try again.");
            makeMove();
        }
    }

    private static boolean isValidMove(int row, int column) {
        return row >= 1 && row < 4 && column >= 1 && column < 4 && board[row][column] == ' ';
    }

    private static void checkWinCondition() {
        if (checkRows() || checkColumns() || checkDiagonals()) {
            isGameOver = true;

        } else if (isBoardFull()) {
            isGameOver = true;
            System.out.println("Draw!");
        }

    }

    private static boolean checkRows() {
        for (int row = 1; row < 4; row++) {
            if (board[row][1] == currentPlayer && board[row][2] == currentPlayer && board[row][3] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumns() {
        for (int column = 1; column < 4; column++) {
            if (board[1][column] == currentPlayer && board[2][column] == currentPlayer && board[3][column] == currentPlayer) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonals() {
        if (board[1][1] == currentPlayer && board[2][2] == currentPlayer && board[3][3] == currentPlayer) {
            return true;
        } else if (board[1][3] == currentPlayer && board[2][2] == currentPlayer && board[3][1] == currentPlayer) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int row = 1; row < 4; row++) {
            for (int column = 1; column < 4; column++) {
                if (board[row][column] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void switchPlayer() {
        previousPlayer = currentPlayer;
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}