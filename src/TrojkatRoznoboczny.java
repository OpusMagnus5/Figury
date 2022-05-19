public class TrojkatRoznoboczny extends Figura{
    private int a;
    private int b;
    private int c;
    private double field;

    public TrojkatRoznoboczny(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.a = tabOfSides[0];
        this.b = tabOfSides[1];
        this.c = tabOfSides[2];
        double p = getCircuit() / 2; // połowa obwodu
        this.field = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getField() {
        return field;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" a: ")
                .append(this.a)
                .append(" b: ")
                .append(this.b)
                .append(" c: ")
                .append(this.c)
                .append(" Pole: ")
                .append(String.format("%.2f", this.field));

        return sb.toString();
    }
}
