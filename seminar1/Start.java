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
        // Peasant peasant = new Peasant("Carl", 120, 25, 35);
        // Magician mage = new Magician("Professor", 100, 15, 25);
        // Monk monk = new Monk("monk", 100, 10, 25);
        // Crossbowman bow = new Crossbowman("bow", 110, 30, 45);
        // Spearman spear = new Spearman("jack", 130, 40, 50);
        // Thief rouge = new Thief("shadow", 90, 15, 50);
        // Sharpshooter sniper = new Sharpshooter("killer", 120, 20, 50);
        ArrayList<Unit> teamRed = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(3)) {
                case 0:
                    teamRed.add(new Magician(GetName()));
                    break;
                case 1:
                    teamRed.add(new Thief(GetName()));
                    break;
                case 2:
                    teamRed.add(new Sharpshooter(GetName()));
                    break;

                case 3:
                    teamRed.add(new Peasant(GetName()));
                    break;
            }
        }
        System.out.println("--------------Team RED------------------");
        teamRed.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                if (o2.GetSpeed() == o1.GetSpeed()) {
                    return o2.GetHP() - o1.GetHP();
                }
                return o2.GetSpeed() - o1.GetSpeed();
            }
        });
        GetInfoTeam(teamRed);
        teamRed.clear();// Удаляю чтоб несколько раз запускать и проверять состав игроков

        ArrayList<Unit> teamBlue = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(3)) {
                case 0:
                    teamBlue.add(new Spearman(GetName()));
                    break;
                case 1:
                    teamBlue.add(new Crossbowman(GetName()));
                    break;
                case 2:
                    teamBlue.add(new Monk(GetName()));
                    break;
                case 3:
                    teamBlue.add(new Peasant(GetName()));
                    break;
            }

        }
        System.out.println("--------------Team BLUE------------------");
        teamBlue.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                if (o2.GetSpeed() == o1.GetSpeed()) {
                    return o2.GetHP() - o1.GetHP();
                }
                return o2.GetSpeed() - o1.GetSpeed();
            }
        });
        GetInfoTeam(teamBlue);
        teamRed.clear(); // Удаляю чтоб несколько раз запускать и проверять состав игроков

    }

    public static String GetName() {
        return String.valueOf(Names.values()[new Random().nextInt(13)]);
    }

    public static void GetInfoTeam(ArrayList<Unit> list) {
        for (Unit unit : list) {
            System.out.println(unit.GetInfo());
        }
    }
}