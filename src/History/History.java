package History;

import java.util.List;
import java.util.Stack;

public class History {

    static List<String> history = new Stack<>() ;
    public static void keepTrack(String piece)
    {
        history.add(piece) ;
    }

}
