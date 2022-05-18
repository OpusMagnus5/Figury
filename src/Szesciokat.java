public class Szesciokat extends Figura {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;

    public Szesciokat(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.a = tabOfSides[0];
        this.b = tabOfSides[1];
        this.c = tabOfSides[2];
        this.d = tabOfSides[3];
        this.e = tabOfSides[4];
        this.f = tabOfSides[5];
    }
}
