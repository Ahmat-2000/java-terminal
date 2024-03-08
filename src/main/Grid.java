package main;
/**
 * Grid
 */
public class Grid {
    private String[][] grid;
    private int row, col, count;
    
    
    public Grid(int row, int col) {
        this.grid = new String[row][col];
        this.row = row;
        this.col = col;
        clear();
    }

    public void print(){
        System.out.print("+");
        for (int i = 0; i < col; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < row; i++) {
            System.out.print("|");
            for (int j = 0; j < col; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println("|");
        }

        System.out.print("+");
        for (int i = 0; i < col; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public void addPoint(int x, int y){
        grid[x][y] = Constants.GRID_POINT;
        count += 1;
    }
    public void deletePoint(int x, int y){
        grid[x][y] = " ";
        count -= 1;
    }
    public void clear(){
        count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = " ";
            }
        }
    }
    public boolean containtPoint(int x, int y){
        return grid[x][y] == Constants.GRID_POINT;
    }
    public boolean isFull(){
        return count == row*col;
    }


    public String[][] getGrid() {
        return grid;
    }
    public void setGrid(String[][] grid) {
        this.grid = grid;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }
    
}