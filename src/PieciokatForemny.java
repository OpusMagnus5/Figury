public class PieciokatForemny extends Pieciokat{
    double field;

    public PieciokatForemny(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.field = (Math.pow(tabOfSides[0], 2) / 4) * Math.sqrt(25 + 10 * Math.sqrt(5));
    }
}
