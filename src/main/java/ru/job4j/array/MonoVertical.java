package ru.job4j.array;

public class MonoVertical {
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int row = 0; row < board.length; row++) {
                if (board[row][column] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
