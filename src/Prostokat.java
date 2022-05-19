public class Prostokat extends Czworokat{
    private double field;

    public Prostokat(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.field = getA() * getB();
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
