public class VengefulSLList<apple> extends SLList<apple>{

    SLList<apple> lostApples;

    public VengefulSLList() {
        // super();
        lostApples = new SLList<>();
    }

    public void printLostApples() {
        lostApples.printPineapples();
    }

    @Override
    public apple removeLast() {
        apple x = super.removeLast();
        lostApples.addFirst(x);
        return x;
    }

    public static void main(String[] args) {
        /** VengefulSLList is able to memorize deleted items */
        VengefulSLList<Integer> vsl = new VengefulSLList<>();
        vsl.addFirst(12);
        vsl.addFirst(14);
        vsl.addFirst(16);
        vsl.addFirst(18);
        vsl.addFirst(20);

        vsl.removeLast();
        vsl.removeLast();

        System.out.println("The fallen are: ");
        vsl.printLostApples();
    }
}
