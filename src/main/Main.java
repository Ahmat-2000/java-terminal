package main;
public class Main {
    public static void main(String[] args) {
        Grid g = new Grid(Constants.GRID_LINES, Constants.GRID_COLUMNS);
        Game gameplay = new Game(g);

        System.out.println("Grid of size " + Constants.GRID_LINES +"*"+ Constants.GRID_COLUMNS);
        g.print();
        gameplay.play();
    }
}
