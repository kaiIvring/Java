public class HoFDemo {
    /** higher order function */

    public static int doTwice(IntUnaryFunction f, int x) {
        return f.apply(f.apply(x));
    }

    public static void main(String[] args) {
        int result = doTwice(new TenX(),2);
        System.out.println(result);
    }
}
