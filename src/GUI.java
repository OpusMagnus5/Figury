import java.util.Scanner;

public class GUI {
    static Scanner in = new Scanner(System.in);

    public static void askForSides(){
        System.out.println("Podaj pięć zestawów z bokami figur:");
    }

    public static int[][] getSides(){
        int[][] tabOfSides = new int[5][6];
        String[] sides;
        for (int i = 0; i < 5; i++){ // 5 zestawów
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
}
