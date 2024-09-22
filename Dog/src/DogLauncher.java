public class DogLauncher {
    public static void main(String[] args) {
        System.out.println(Dog.binomen);
//        Dog d = new Dog(20);
//
//        // to create an array of objects
//        Dog[] dogs = new Dog[2];
//        dogs[0] = new Dog(2);
//        dogs[1] = new Dog(40);
//
//        dogs[0].makeNoise();
//        dogs[1].makeNoise();
//        d.makeNoise();
        Dog chester = new Dog(17);
        Dog yusuf = new Dog(150);
        Dog larger_1 = Dog.maxDog(chester, yusuf);
        larger_1.makeNoise();
        Dog larger_2 = chester.maxDog(yusuf);
        larger_2.makeNoise();
    }
}
