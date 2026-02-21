package br.com.vagner.sudoku.model;

public class Board {

    private Cell[][] grid = new Cell[9][9];

    public Board(String[] args) {
        for (String arg : args) {
            String[] parts = arg.split(";");
            String[] position = parts[0].split(",");
            String[] valueFixed = parts[1].split(",");

            int row = Integer.parseInt(position[0]);
            int col = Integer.parseInt(position[1]);
            int value = Integer.parseInt(valueFixed[0]);
            boolean fixed = Boolean.parseBoolean(valueFixed[1]);

            grid[row][col] = new Cell(value, fixed);
        }
    }

    public Cell[][] getGrid() {
        return grid;
    }
}
