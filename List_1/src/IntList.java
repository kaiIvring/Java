public class IntList {
    public int first;
    public IntList rest;

    public IntList (int f, IntList r) {
        first = f;
        rest = r;
    }

    /* return the size of the List using recursion */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return rest.size() + 1;
    }

    /* return the size of the array using no recursion*/
    public int iterativeSize() {
        IntList p = this;
        int size = 0;
        while (p != null) {
            p = p.rest;
            size++;
        }
        return size;
    }

    /* returns the ith item in the List */
    public int iterativeGet(int i) {
        IntList p = this;
        for (int k = 0; k < i - 1; k++) {
            p = p.rest;
        }
        return p.first;
    }
    /* return the ith item in the List using recursion */
    public int get (int i) {
        if (i == 1) {
            return this.first;
        }
        return rest.get(i - 1);
    }

    public static void main(String[] args) {
        IntList L = new IntList (15, null);
        L = new IntList (10, L);
        L = new IntList (5, L);
        System.out.println (L.get(1));
        System.out.println (L.iterativeGet(1));
        System.out.println (L.size());
        System.out.println(L.iterativeSize());
    }
}
