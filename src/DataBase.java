public class DataBase {
    private final Figura[] figury = new Figura[5];


    public DataBase(int[][] tabOfSides){
        for (int i = 0; i < tabOfSides.length; i++){
            if (Figura.numberOfSides(tabOfSides[i]) == 3){
                if (Figura.isTrojkat(tabOfSides[i])){
                    if (Figura.isTrojkatRownoboczny(tabOfSides[i])){
                        this.figury[i] = new TrojkatRownoboczny("Trójkąt równoboczny", setCircuit(tabOfSides[i]), tabOfSides[i]);
                    }else if (Figura.isTrojkatRownoramienny(tabOfSides[i])){
                        this.figury[i] = new TrojkatRownoramienny("Trójkąt równoramienny", setCircuit(tabOfSides[i]), tabOfSides[i]);
                    }else{
                        this.figury[i] = new TrojkatRoznoboczny("Trójkąt różnoboczny", setCircuit(tabOfSides[i]), tabOfSides[i]);
                    }
                }
            }
        }
    }

    private int setCircuit(int[] tabOfSides){
        int circuit = 0;

        for (int i = 0; i < tabOfSides.length; i++){
            circuit += tabOfSides[i];
        }

        return circuit;
    }
}
