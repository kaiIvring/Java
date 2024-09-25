public class Walrus {

    public int weight;
    public double tucks;
    public Walrus (int w, double t) {
        weight = w;
        tucks = t;
    }

    public static void main(String[] args) {
        Walrus a = new Walrus(1000,500.0);
        Walrus b;
        b = a;
        b.tucks = 8.3;
        System.out.println(a.tucks);
    }
}
