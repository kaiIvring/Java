public class ArgsDemo {
    public static void main(String[] args) {
        String sum = "";
        for (int i = 0; i< args.length; i++) {
            sum += args[i];
        }
        System.out.print(sum);
    }
}
