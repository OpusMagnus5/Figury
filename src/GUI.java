import java.util.Scanner;

public class GUI {
    static Scanner in = new Scanner(System.in);

    public static void askForSides(){
        System.out.println("Podaj zestawy z bokami figur:");
    }

    public static int[][] getSides(){
        in.nextLine(); // CZYSZCZENIE BUFORA Z ENTERA PO WPROWADZENIU LICZBY ZESTAWÓW
        int[][] tabOfSides = new int[Main.NUMBER_OF_FIGURS][6];
        String[] sides;
        for (int i = 0; i < tabOfSides.length; i++){ // 5 zestawów
            sides = in.nextLine().split(" ");
            for (int j = 0; j < sides.length; j++){
                tabOfSides[i][j] = Integer.parseInt(sides[j]);
            }
        }
        return tabOfSides;
    }

    public static void informsNotFigure(int[] tabOfSides){
        int numsOfSides = Figura.numberOfSides(tabOfSides);

        switch (numsOfSides){
            case 2:
                for (int i = 0; i < numsOfSides; i++){
                    System.out.print(tabOfSides[i] + " ");
                }
                System.out.println("- z takich boków nie można utworzyć żadnej figury.");
                break;
            case 3:
               for (int i = 0; i < numsOfSides; i++){
                   System.out.print(tabOfSides[i] + " ");
               }
                System.out.println("- z takich boków nie można utworzyć trójkąta.");
               break;
            case 4:
                for (int i = 0; i < numsOfSides; i++){
                    System.out.print(tabOfSides[i] + " ");
                }
                System.out.println("- z takich boków nie można utworzyć czworokąta.");
                break;
            case 5:
                for (int i = 0; i < numsOfSides; i++){
                    System.out.print(tabOfSides[i] + " ");
                }
                System.out.println("- z takich boków nie można utworzyć pięciokąta.");
                break;
            case 6:
                for (int i = 0; i < numsOfSides; i++){
                    System.out.print(tabOfSides[i] + " ");
                }
                System.out.println("- z takich boków nie można utworzyć sześciokąta.");
                break;
        }
    }

    public static void listFigurs(DataBase dataBase){
        for (Figura figura : dataBase.getFigury()){
            if (figura != null) {
                System.out.println(figura.toString());
            }
        }
    }

    public static int getNumberOfFigurs(){
        System.out.print("Podaj liczbę wprowadzanych figur: ");
        return in.nextInt();
    }
}
