public class RotatingSLList<apple> extends SLList<apple>{

    public void rotateRight() {
        apple x = removeLast();
        addFirst(x);
    }


    public static void main(String[] args) {
        RotatingSLList<Integer> rsl = new RotatingSLList<>();
        rsl.addFirst(13);
        rsl.addFirst(12);
        rsl.addFirst(11);
        rsl.addFirst(10);

        rsl.rotateRight();
        rsl.printPineapples();
    }
}
