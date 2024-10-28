public interface List61B<apple> {

    /** insert item to the list */
    public void insert(apple x, int position);

    /** insert x into the back of the list */
    public void addLast(apple x);

    /** return the item from the back of the list */
    public apple getLast();

    /** returns the ith item in the list. */
    public apple get(int i);

    /** returns the size of list */
    public int size();

    /** delete item from back of the list and
     * returns deleted item. */
    public apple removeLast();

    /** prints all items in the list */
    default public void printList() {
        for (int i = 0; i < size(); i++) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }

}