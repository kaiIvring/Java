import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraySet<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public ArraySet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    public void add(T x) {
        if (x == null) {
            throw new IllegalArgumentException("can't add null");// throw an exception
        }
        if (contains(x)) {
            return;
        }
        items[size] = x;
        size += 1;
    }

    public boolean contains(T x) {
        for (int i = 0; i < size; i++) {
           if (items[i].equals(x)) {
               return true;
           }
        }
        return false;
    }


    private class ArraySetIterator implements Iterator<T> {
        // current position of the iterator
        private int wizPos;

        public ArraySetIterator() {
            wizPos = 0;
        }

        @Override
        public boolean hasNext() {
            return wizPos < size;
        }

        @Override
        public T next() {
            T returnItem = items[wizPos];
            wizPos += 1;
            return returnItem;
        }

    }

    /** Returns an iterator (aka seer) */
    public Iterator<T> iterator() {
        return new ArraySetIterator();
    }

    // A better toString
    @Override
    public String toString() {
        List<String> listOfItems = new ArrayList<>();
        for (T x : this) {
            listOfItems.add(x.toString());
        }
        return "{" + String.join(", ",listOfItems) + "}";
    }
    /*
    @Override
    public String toString() {
        StringBuilder x = new StringBuilder();
        x.append("(");
        for (T i : this) {
            x.append(i.toString());
            x.append(" ");
        }
        x.append(")");
        return x.toString();
    }*/

    @Override
    public boolean equals(Object o) {
        if (o instanceof ArraySet otherArraySet) {
            if (this.size != otherArraySet.size) {
                return false;
            }
            for (T i : this) {
                if (!otherArraySet.contains(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArraySet<Integer> S = new ArraySet<>();
        // S.add(null);
        S.add(2);
        S.add(33);
        S.add(92);

        System.out.println(S.contains(33));
        System.out.println(S.contains(11));

        // the following ugly and nice iteration code is essentially the same
        // ugly iteration
        Iterator<Integer> seer = S.iterator();
        while (seer.hasNext()) {
            int x = seer.next();
            System.out.println(x);
        }
        //nice iteration
        for (int i : S) {
            System.out.println(i);
        }

        // toString
        System.out.println(S);

        // .equals()
        ArraySet<Integer> S2 = new ArraySet<>();
        S2.add(2);
        S2.add(33);
        S2.add(92);
        System.out.println(S.equals(S2));
    }
}
