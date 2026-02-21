package br.com.vagner.sudoku;

import br.com.vagner.sudoku.model.Board;
import br.com.vagner.sudoku.service.SudokuValidator;

public class Main {

    public static void main(String[] args) {

        Board board = new Board(args);

        if (SudokuValidator.isValid(board.getGrid())) {
            System.out.println("Tabuleiro válido!");
        } else {
            System.out.println("Tabuleiro inválido!");
        }
    }
}
