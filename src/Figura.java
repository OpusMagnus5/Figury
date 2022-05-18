public class Figura {
    private String name;
    private int circuit;

    public Figura(){

    }

    public Figura(String name, int[] tabOfSides){
        this.name = name;
        this.circuit = 0;
        for (int i = 0; i < tabOfSides.length; i++){
            this.circuit += tabOfSides[i];
        }
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

    public static boolean isFigura(int[] tabOfSides){ //TODO sprawdzic trojkat 5 55 5
        int longestSide = 0;
        int suma = 0;
        for (int i = 0; i < numberOfSides(tabOfSides); i++){
            if (tabOfSides[longestSide] < tabOfSides[i]){
                longestSide = i;
            }
        }
        for (int i = 0; i < numberOfSides(tabOfSides); i++){
            if (i != longestSide){
                suma += tabOfSides[i];
            }
        }
        if (tabOfSides[longestSide] < suma){
            return true;
        }
        GUI.informsNotFigure(tabOfSides);
        return false;
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
        if(!isForemny(tabOfSides) && !isTrojkatRownoramienny(tabOfSides)){
            return true;
        }
        return false;
    }

    public static boolean isProstokat(int[] tabOfSides){
        if (tabOfSides[0] == tabOfSides[2] && tabOfSides[1] == tabOfSides[3]) {
            return true;
        }
        return false;
    }

    public static boolean isForemny(int[] tabOfSides){
        for (int i = 1; i < numberOfSides(tabOfSides); i++){
            if(tabOfSides[0] != tabOfSides [i]){
                return false;
            }
        }
        return true;
    }
}
