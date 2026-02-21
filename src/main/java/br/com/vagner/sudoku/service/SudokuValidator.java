package br.com.vagner.sudoku.service;

import br.com.vagner.sudoku.model.Cell;
import java.util.HashSet;
import java.util.Set;

public class SudokuValidator {

    public static boolean isValid(Cell[][] grid) {
        return validateRows(grid) && validateColumns(grid) && validateBoxes(grid);
    }

    private static boolean validateRows(Cell[][] grid) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                int value = grid[i][j].getValue();
                if (value != 0 && !seen.add(value)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validateColumns(Cell[][] grid) {
        for (int i = 0; i < 9; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                int value = grid[j][i].getValue();
                if (value != 0 && !seen.add(value)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validateBoxes(Cell[][] grid) {
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                Set<Integer> seen = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        int value = grid[i][j].getValue();
                        if (value != 0 && !seen.add(value)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
