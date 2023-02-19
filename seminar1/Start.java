import java.lang.reflect.Array;
import java.security.cert.LDAPCertStoreParameters;
import java.util.ArrayList;
import java.util.Random;
import pack.*;

public class Start {

    public static void main(String[] args) throws Exception {
        // Peasant peasant = new Peasant("Carl", 120, 25, 35);
        // Magician mage = new Magician("Professor", 100, 15, 25);
        // Monk monk = new Monk("monk", 100, 10, 25);
        // Crossbowman bow = new Crossbowman("bow", 110, 30, 45);
        // Spearman spear = new Spearman("jack", 130, 40, 50);
        // Thief rouge = new Thief("shadow", 90, 15, 50);
        // Sharpshooter sniper = new Sharpshooter("killer", 120, 20, 50);
        ArrayList<Unit> listOfheroes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    listOfheroes.add(new Spearman(GetName()));
                    break;
                case 1:
                    listOfheroes.add(new Magician(GetName()));
                    break;
                case 2:
                    listOfheroes.add(new Thief(GetName()));
                    break;
                case 3:
                    listOfheroes.add(new Sharpshooter(GetName()));
                    break;
                case 4:
                    listOfheroes.add(new Crossbowman(GetName()));
                    break;
                case 5:
                    listOfheroes.add(new Monk(GetName()));
                    break;
                case 6:
                    listOfheroes.add(new Peasant(GetName()));
                    break;
            }

            for (Unit element : listOfheroes) {
                System.out.println(element.GetInfo());
            }
            listOfheroes.clear();
        }

    }

    public static String GetName() {
        return String.valueOf(Names.values()[new Random().nextInt(13)]);
    }
}