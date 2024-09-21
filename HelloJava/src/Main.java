public class Main {
    public static void main(String[] args) {
        int x = 5, y = 10;
        System.out.println(Larger(x, y));
        System.out.println("Hello world!");
    }
    public static int Larger(int x, int y) {
        if(x > y) {
            return x;
        }
        else {
            return y;
        }
    }
}
