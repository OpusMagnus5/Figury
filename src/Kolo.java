public class Kolo extends Figura {
    private int r;
    private double field;

    public Kolo(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.r = tabOfSides[0];
        this.field = Math.PI * Math.pow(this.r, 2);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" r: ")
                .append(this.r)
                .append(" Pole: ")
                .append(String.format("%.2f", this.field));

        return sb.toString();
    }
}
