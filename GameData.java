package lab8;

import java.util.*;

public class GameData {

    private static char currTurn;
    private static List<Box> boxes;

    public GameData()
    {
        currTurn = 'O';
        // whole game should be 80x80
        for (int i = 10; i < 70; i += 20)
        {
            for (int j = 10; j < 70; j += 20)
            {
                boxes.add(new Box(i, j));
            }
        }
    }

    public static char getTurn()
    {
        return currTurn;
    }

    public static List<Box> getBoxes()
    {
        return boxes;
    }

    public static void switchTurn()
    {
        currTurn = (currTurn == 'O') ? 'X' : 'O';
    }
    
}
