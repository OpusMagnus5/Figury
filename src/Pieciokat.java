public class Pieciokat extends Figura{
    int a;
    int b;
    int c;
    int d;
    int e;

    public Pieciokat(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.a = tabOfSides[0];
        this.b = tabOfSides[1];
        this.c = tabOfSides[2];
        this.d = tabOfSides[3];
        this.e = tabOfSides[4];
    }
}
