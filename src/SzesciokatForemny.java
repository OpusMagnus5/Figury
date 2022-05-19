public class SzesciokatForemny extends Szesciokat{
    private double field;

    public SzesciokatForemny(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.field = (3 * (Math.pow(tabOfSides[0], 2)) * Math.sqrt(3)) / 2;
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
