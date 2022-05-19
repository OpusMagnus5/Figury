public class PieciokatForemny extends Pieciokat{
    private double field;

    public PieciokatForemny(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.field = (Math.pow(tabOfSides[0], 2) / 4) * Math.sqrt(25 + 10 * Math.sqrt(5));
    }

    public double getField() {
        return field;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("Pole: ")
                .append(String.format("%.2f", this.field));

        return sb.toString();
    }
}
