import java.util.Comparator;

public class Dog implements Comparable<Dog> {
   public String name;
   private int size;
   public Dog(String n, int s) {
       this.name = n;
       this.size = s;
   }
   public void bark() {
       System.out.println(name + " says: bark");
   }

    /**
     * public interface Comparable<T> {
     *     public int compareTo(T obj);
     * }
     */
   /** Override Comparable */
   @Override
   public int compareTo(Dog otherDog) {
       return this.size - otherDog.size;
   }


    /**
     * public interface Comparator<T> {
     *     int compare(T o1, T o2);
     * }
     */
   /** Comparator */
   private static class NameComparator implements Comparator<Dog> {
       @Override
       public int compare(Dog a, Dog b) {
           return a.name.compareTo(b.name);
       }
   }
   public static Comparator<Dog> getNameComparator() {
       return new NameComparator();
   }
}
