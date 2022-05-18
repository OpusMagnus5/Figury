public class SzesciokatForemny extends Szesciokat{
    double field;

    public SzesciokatForemny(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.field = (3 * (Math.pow(tabOfSides[0], 2)) * Math.sqrt(3)) / 2;
    }
}
