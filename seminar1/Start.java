import java.lang.reflect.Array;
import java.security.cert.LDAPCertStoreParameters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import pack.*;

public class Start {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("--------------Team RED------------------");
        ArrayList<Unit> teamRed = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(3)) {
                case 0:
                    teamRed.add(new Magician(GetName(), i, 9));
                    break;
                case 1:
                    teamRed.add(new Thief(GetName(), i, 9));
                    break;
                case 2:
                    teamRed.add(new Sharpshooter(GetName(), i, 9));
                    break;

                case 3:
                    teamRed.add(new Peasant(GetName(), i, 9));
                    break;
            }
        }
        SetTeam(teamRed, 2);
        GetInfoTeam(teamRed);
        System.out.println(" =======Sorted======");
        SortedTeam(teamRed);
        GetInfoTeam(teamRed);
        teamRed.clear();

        System.out.println("--------------Team BLUE------------------");
        ArrayList<Unit> teamBlue = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(3)) {
                case 0:
                    teamBlue.add(new Spearman(GetName(), i, 0));
                    break;
                case 1:
                    teamBlue.add(new Crossbowman(GetName(), i, 0));
                    break;
                case 2:
                    teamBlue.add(new Monk(GetName(), i, 0));
                    break;
                case 3:
                    teamBlue.add(new Peasant(GetName(), i, 0));
                    break;
            }
        }
        SetTeam(teamBlue, 1);
        GetInfoTeam(teamBlue);
        System.out.println(" =======Sorted======");
        SortedTeam(teamBlue);
        GetInfoTeam(teamBlue);
        teamBlue.clear();
    }

    public static String GetName() {
        return String.valueOf(Names.values()[new Random().nextInt(13)]);
    }

    public static void GetInfoTeam(ArrayList<Unit> list) {
        for (Unit unit : list) {
            System.out.println(unit.GetInfo());
        }
    }

    public static ArrayList<Unit> SetTeam(ArrayList<Unit> list, int numberOfTeam) {
        for (Unit unit : list) {
            unit.SetTeam(numberOfTeam);
        }
        return list;
    }

    public static void SortedTeam(ArrayList<Unit> arr) {
        arr.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                if (o2.GetSpeed() == o1.GetSpeed()) {
                    return o2.GetHP() - o1.GetHP();
                }
                return o2.GetSpeed() - o1.GetSpeed();
            }
        });
    }
}