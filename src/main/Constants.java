package main;

import java.util.HashMap;

public class Constants {
    public static final int  GRID_LINES = 5;
    public static final int  GRID_MIN_LINES = 10 ;
    public static final int  GRID_MAX_LINES = 50 ;

    public static final int  GRID_COLUMNS = 10;
    public static final int  GRID_MIN_COLUMNS = 10 ;
    public static final int  GRID_MAX_COLUMNS = 50 ;
    
    public static final String  GRID_POINT = "o" ;

    public static final HashMap<String , String> COMMAND = new HashMap<>();
    
    static{
        COMMAND.put("add", "This command take x and y as arguments and add the 'o' to the grid at point (x,y)");
        COMMAND.put("clear", "This command does not need arguments and clear the content of the grid");
        COMMAND.put("remove", "This command take x and y as arguments and remove the 'o' from the grid at point (x,y)");
        COMMAND.put("help", "This command will display you all commands and their descriptions");

    }
}
