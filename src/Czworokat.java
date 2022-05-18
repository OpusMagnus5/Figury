public class Czworokat extends Figura{
    int a;
    int b;
    int c;
    int d;

    public Czworokat(String name, int[] tabOfSides){
        super(name, tabOfSides);
        this.a = tabOfSides[0];
        this.b = tabOfSides[1];
        this.c = tabOfSides[2];
        this.d = tabOfSides[3];
    }
}
