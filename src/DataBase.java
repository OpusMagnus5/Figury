public class DataBase {
    private final Figura[] figury = new Figura[5];


    public DataBase(int[][] tabOfSides){
        for (int i = 0; i < tabOfSides.length; i++){
            if (Figura.numberOfSides(tabOfSides[i]) == 3 && Figura.isFigura(tabOfSides[i])){
                    if (Figura.isForemny(tabOfSides[i])){
                        this.figury[i] = new TrojkatRownoboczny("Trójkąt równoboczny", tabOfSides[i]);
                    }else if (Figura.isTrojkatRownoramienny(tabOfSides[i])){
                        this.figury[i] = new TrojkatRownoramienny("Trójkąt równoramienny", tabOfSides[i]);
                    }else{
                        this.figury[i] = new TrojkatRoznoboczny("Trójkąt różnoboczny", tabOfSides[i]);
                    }
                continue;
            }
            if (Figura.numberOfSides(tabOfSides[i]) == 4){
                if (Figura.isFigura(tabOfSides[i]) && Figura.isForemny(tabOfSides[i])){
                        this.figury[i] = new Kwadrat("Kwadrat", tabOfSides[i]);
                    }else if (Figura.isProstokat(tabOfSides[i])){
                        this.figury[i] = new Prostokat("Prostokąt", tabOfSides[i]);
                    }else{
                        this.figury[i] = new Czworokat("Czworokąt", tabOfSides[i]);
                    }
                continue;
            }
            if (Figura.numberOfSides(tabOfSides[i]) == 5 && Figura.isFigura(tabOfSides[i])){
                    if (Figura.isForemny(tabOfSides[i])){
                        this.figury[i] = new PieciokatForemny("Pieciokąt Foremny", tabOfSides[i]);
                    }else{
                        this.figury[i] = new Prostokat("Prostokąt", tabOfSides[i]);
                    }
                continue;
            }
            if (Figura.numberOfSides(tabOfSides[i]) == 6 && Figura.isFigura(tabOfSides[i])){
                    if (Figura.isForemny(tabOfSides[i])){
                        this.figury[i] = new SzesciokatForemny("Sześciokąt Foremny", tabOfSides[i]);
                    }else{
                        this.figury[i] = new Szesciokat("Sześciokąt", tabOfSides[i]);
                    }
                continue;
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
