public class AList<apple> {
    private apple[] items;
    private int size;

    /** create an empty list */
    public AList() {
        items =(apple[]) new Object[100];
        size = 0;
    }

    /** resizes the underline array to the target capacity. */
    private void resize(int capacity) {
        apple[] a =(apple[]) new Object[size + 1];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** insert x into the back of the list */
    public void addLast(apple x) {
        /** if the list is full */
        if (size == items.length) {
            resize(size * 2); //turns out make size * 2 every time we run out of space is the best solution
        }
        items[size] = x;
        size += 1;
    }

    /** return the item from the back of the list */
    public apple getLast() {
        return items[size - 1];
    }

    /** returns the ith item in the list. */
    public apple get(int i) {
        return items[i];
    }

    /** returns the size of list */
    public int size() {
        return size;
    }

    /** delete item from back of the list and
     * returns deleted item. */
    public apple removeLast() {
        apple returnItem = getLast();
        items[size - 1] = null;
        size -= 1;
        return returnItem;
    }

}
