/* <pineapple> -> placeholder, 占位符，允许用户修改具体类型, 或称为泛型*/
public class SLList<pineapple> {

    /* if the nested class never uses any instance variables or methods
    of the outer class,declare it static
     */
    private class IntNode { // nested class 嵌套类
        public pineapple item;
        private IntNode next;

        public IntNode (pineapple i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /*The first item, if it exists, is at sentinel.next. */
    private IntNode sentinel;
    public int size;

    /* Creates a new SLLists with one item, namely x. */
    public SLList (pineapple x) {
        sentinel = new IntNode(null,null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /* Creates an empty list */
    public SLList () {
        sentinel = new IntNode(null,null);
        size = 0;
    }

    /* Adds item x to the front of the list. */
    public void addFirst (pineapple x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /* Returns the first item of the list */
    public pineapple getFirst() {
        return sentinel.next.item;
    }

    /* Adds item x to the end of list*/
    public void addLast (pineapple x) {
        size += 1;
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /** remove the last item in the list */
    public pineapple removeLast() {
        IntNode currNode = sentinel.next;
        if (currNode == null) {
            return null;
        }
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        size = size - 1;
        IntNode LastNode = currNode.next;
        currNode.next = null;
        return LastNode.item;

    }

    /** Print items in the List */
    public void printPineapples() {
        IntNode currNode = sentinel.next;
        int temSize = size;
        while (temSize != 0) {
            System.out.print(currNode.item + " ");
            temSize -= 1;
            currNode = currNode.next;
        }
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
        SLList<String> L = new SLList<String>("hello");
        L.addFirst("Java");
        L.addLast("happy");
        int size = L.getSize();
        int size1 = L.size();
        int size2 = L.recurseGetSize();
        System.out.println(L.getFirst());
        System.out.println(size);
        System.out.println(size1);
        System.out.println(size2);
    }
}
