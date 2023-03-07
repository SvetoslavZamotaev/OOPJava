
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import pack.*;

public class Start {
    public static ArrayList<Unit> AllTeams = new ArrayList<>();
    public static ArrayList<Unit> alliance = new ArrayList<>();
    public static ArrayList<Unit> horde = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        for (int i = 0; i <= 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    horde.add(new Magician(GetName(), i + 1, 1));
                    break;
                case 1:
                    horde.add(new Thief(GetName(), i + 1, 1));
                    break;
                case 2:
                    horde.add(new Sharpshooter(GetName(), i + 1, 1));
                    break;

                case 3:
                    horde.add(new Peasant(GetName(), i + 1, 1));
                    break;
            }
        }
        SetTeam(horde, 1);
        for (int i = 0; i <= 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    alliance.add(new Spearman(GetName(), i + 1, 10));
                    break;
                case 1:
                    alliance.add(new Crossbowman(GetName(), i + 1, 10));
                    break;
                case 2:
                    alliance.add(new Monk(GetName(), i + 1, 10));
                    break;
                case 3:
                    alliance.add(new Peasant(GetName(), i + 1, 10));
                    break;
            }
        }
        SetTeam(alliance, 2);
        AllTeams.addAll(horde);
        AllTeams.addAll(alliance);
        SortedTeam(AllTeams);
        System.out.println(" ========= fg ==========");
        Scanner user_input = new Scanner(System.in);
        while (countAlive(alliance)) {
            View.view();
            user_input.nextLine();
            for (Unit unit : AllTeams) {
                if (alliance.contains(unit)) {
                    unit.Step(alliance, horde);
                } else {
                    unit.Step(horde, alliance);
                }
            }
        }
        if (countAlive(alliance)) {
            System.out.println("Right Win");
        } else if (countAlive(horde)) {
            System.out.println("left Win");
        }
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

    public static boolean countAlive(ArrayList<Unit> team) {
        int countsTeam = 11;
        for (Unit unit : team) {
            if (unit.GetHP() == 0 && unit.getState().equals("Die")) {
                countsTeam--;
            }
        }
        if (countsTeam == 0) {
            return false;
        }
        return true;
    }
}