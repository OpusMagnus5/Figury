public class TrojkatRoznoboczny extends Figura{
    int a;
    int b;
    int c;
    double field;

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
}
