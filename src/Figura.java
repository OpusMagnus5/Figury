public class Figura {
    private String name;
    private int circuit;

    public Figura(){

    }

    public Figura(String name, int circuit){
        this.name = name;
        this.circuit = circuit;
    }

    public String getName() {
        return name;
    }

    public int getCircuit() {
        return circuit;
    }

    public static int numberOfSides(int[] tabOfSides){
        int numberOfSides = 0;
        for (int i = 0; i < tabOfSides.length; i++){
            if (tabOfSides[i] != 0){
                numberOfSides++;
            }
        }
        return numberOfSides;
    }

    public static boolean isTrojkat(int[] tabOfSides){
        int longestSide = 0;
        for (int i = 0; i < 3; i++){
            if (longestSide < tabOfSides[i]){
                longestSide = i;
            }
        }
        if (longestSide == 0){
            if (tabOfSides[longestSide] < tabOfSides[1] + tabOfSides[2]){
                return true;
            }
        }else if (longestSide == 1){
            if (tabOfSides[longestSide] < tabOfSides[0] + tabOfSides[2]){
                return true;
            }
        }if (longestSide == 2){
            if (tabOfSides[longestSide] < tabOfSides[1] + tabOfSides[0]){
                return true;
            }
        }
        GUI.informsNotFigure(tabOfSides);
        return false;
    }

    public static boolean isTrojkatRownoboczny(int[] tabOfSides){
        for (int i = 1; i < 3; i++){
            if(tabOfSides[0] != tabOfSides [i]){
                return false;
            }
        }
        return true;
    }

    public static boolean isTrojkatRownoramienny(int[] tabOfSides){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (j == i){
                    j++;
                }
                if (tabOfSides[i] == tabOfSides[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isTrojkatRoznoboczny(int[] tabOfSides){
        if(!isTrojkatRownoboczny(tabOfSides) && !isTrojkatRownoramienny(tabOfSides)){
            return true;
        }
        return false;
    }
}
