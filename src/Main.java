import javax.xml.crypto.Data;
import java.util.Scanner;

public class Main {
    public static final int NUMBER_OF_FIGURS = GUI.getNumberOfFigurs();
    public static void main(String[] args) {
        GUI.askForSides();
        DataBase dataBase = new DataBase(GUI.getSides());

        GUI.listFigurs(dataBase);
    }
}

