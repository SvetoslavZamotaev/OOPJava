import java.util.Random;
import pack.*;

public class Start {

    public static void main(String[] args) throws Exception {
        Peasant peasant = new Peasant("Carl", 120, 25, 35);
        Magician mage = new Magician("Professor", 100, 15, 25);
        Monk monk = new Monk("monk", 100, 10, 25);
        Crossbowman bow = new Crossbowman("bow", 110, 30, 45);
        Spearman spear = new Spearman("jack", 130, 40, 50);
        Thief rouge = new Thief("shadow", 90, 15, 50);
        Sharpshooter sniper = new Sharpshooter("killer", 120, 20, 50);

    }
}