import java.util.Comparator;

public class Maximizer {
    /** Subtype Polymorphism */
    public static Comparable max(Comparable[] items) {
        int maxDex = 0;
        for (int i = 0; i < items.length; i++) {
            int cmp = items[i].compareTo(items[maxDex]);
            if (cmp > 0) {
                maxDex = i;
            }
        }
        return items[maxDex];
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("d1", 12);
        Dog d2 = new Dog("d2", 112);
        Dog d3 = new Dog("d3", 122);
        Dog[] dogs = new Dog[]{d1, d2, d3};

        Dog maxDog = (Dog) max(dogs);
        maxDog.bark();

        Dog d4 = new Dog("apple", 58);
        Dog d5 = new Dog("oops",22);

        /** Comparator */
        Comparator<Dog> nc = Dog.getNameComparator();
        int cmp1 = nc.compare(d4, d5);
        if (cmp1 > 0) {
            // d4 comes after d5
            d4.bark();
        } else {
            // d5 comes after d4
            d5.bark();
        }
    }
}
