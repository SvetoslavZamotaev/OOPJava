package pack;

import java.util.ArrayList;

public interface IngameInterface {
    void Step(ArrayList<Unit> team1, ArrayList<Unit> team2);

    String GetInfo();
}
