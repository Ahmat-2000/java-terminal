package main;

import java.util.Scanner;

@SuppressWarnings("unused")
public class Game {
    private Grid grid;
    private Scanner scanner;
    public Game(Grid g){
        grid = g;
        scanner = new Scanner(System.in);
    }
    public void play(){
        String command = null;
        while (true) {
            command = getUserInput();
            handleCommand(command);
            grid.print();
        }
    }
    public String getUserInput(){
        System.out.print("COMMAND => ");
        return scanner.nextLine();
    }
    public boolean checkCommand(String command){
        return Constants.COMMAND.get(command) != null;
    }
   /*  public void errorMessage(String x){
        try {
            int input = Integer.parseInt(x);
        } catch (Exception e) {
            System.out.println("The arguments should be Integer");            
        }
    } */
    public void handleCommand(String command){
        String[] splitCommand = command.split(" ");
        switch (splitCommand[0]) {
            case "ADD":
            case "add":
                try {
                    int x = Integer.parseInt(splitCommand[1]);
                    int y = Integer.parseInt(splitCommand[2]);
                    grid.addPoint(x, y);
                } catch (Exception e) {
                    System.out.println("The add command should be used like this \n\t"+
                                        "add  x  y \n where x and y are two Integers");            
                }
                break;

            case "CLEAR":
            case "clear":
                grid.clear();
                break;

            case "HELP":
            case "help":
                Constants.COMMAND.forEach( (k, v) -> System.out.println(k+"\t"+v));
                break;

            case "REMOVE":
            case "remove":
                try {
                    int x = Integer.parseInt(splitCommand[1]);
                    int y = Integer.parseInt(splitCommand[2]);
                    grid.deletePoint(x, y);
                } catch (Exception e) {
                    System.out.println("The remove command should be used like this \n\t"+
                                        "remove  x  y \n where x and y are two Integers");            
                }
                break;

            default:
            System.out.println("Commande introuvable");
                break;
        }
    }
}
