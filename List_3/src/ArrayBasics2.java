import java.util.Scanner;

public class ArrayBasics2 {

    public static int askUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What index do you want?");
        int index = scanner.nextInt();
        return index;
    }
    public static void main(String[] args) {
        int[] x = new int[]{100, 101, 102, 103};
        int indexOfInterest = askUser();
        int k = x[indexOfInterest];
        System.out.print(k);
    }
}
