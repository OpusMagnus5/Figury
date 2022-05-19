public class Pieciokat extends Figura{
   private int a;
   private int b;
   private int c;
   private int d;
   private int e;

    public Pieciokat(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.a = tabOfSides[0];
        this.b = tabOfSides[1];
        this.c = tabOfSides[2];
        this.d = tabOfSides[3];
        this.e = tabOfSides[4];
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

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append("a: ")
                .append(this.a)
                .append(" b: ")
                .append(this.b)
                .append(" c: ")
                .append(this.c)
                .append(" d: ")
                .append(this.d)
                .append(" e: ")
                .append(this.e)
                .append(" ");

        return sb.toString();
    }
}
