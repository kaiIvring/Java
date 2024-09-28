public class SLList {

    /* if the nested class never uses any instance variables or methods
    of the outer class,declare it static
     */
    private static class IntNode { // nested class 嵌套类
        public int item;
        public IntNode next;

        public IntNode (int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /*The first item, if it exists, is at sentinel.next. */
    private IntNode sentinel;
    private int size;

    /* Creates a new SLLists with one item, namely x. */
    public SLList (int x) {
        sentinel = new IntNode(0,null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /* Creates an empty list */
    public SLList () {
        sentinel = new IntNode(0,null);
        size = 0;
    }

    /* Adds item x to the front of the list. */
    public void addFirst (int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /* Returns the first item of the list */
    public int getFirst() {
        return sentinel.next.item;
    }

    /* Adds item x to the end of list*/
    public void addLast (int x) {
        size += 1;
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /* Returns the size of the list*/
    public int getSize () {
        IntNode p = sentinel.next;
        int size = 0;
        while (p != null) {
            p = p.next;
            size++;
        }
        return size;
    }

    public int recurseGetSize () {
        return sizeHelper(sentinel.next);
    }

    /* Returns the size of the list starting at IntNode p.*/
    private int sizeHelper (IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return sizeHelper (p.next) + 1;
    }

    public int size () {
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(5);
        L.addFirst(10);
        L.addLast(20);
        int size = L.getSize();
        int size1 = L.size();
        int size2 = L.recurseGetSize();
        System.out.println(L.getFirst());
        System.out.println(size);
        System.out.println(size1);
        System.out.println(size2);
    }
}
