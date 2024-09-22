public class Dog {

    /** instance variable */
    public int weightInPounds;
    public static String binomen = "Canis familiaris";
    //static instance variable,general to the whole class,not a specific dog

    /** constructor 构造函数 */
    public Dog(int w) {
        weightInPounds = w;
    }
    /** Non-static method,a.k.a. instance Method */
    public void makeNoise() {
        if(weightInPounds < 10) {
            System.out.println("yipyipyip!");
        }else if(weightInPounds < 30) {
            System.out.println("bark. bark.");
        }else {
            System.out.println("woof!");
        }
    }

    /** the comparison of the same method using static and Non-static method */

    public static Dog maxDog(Dog d1, Dog d2) {
        if(d1.weightInPounds > d2.weightInPounds) {
            return d1;
        } else {
            return d2;
        }
    }

    public Dog maxDog(Dog d2) {
        if(weightInPounds > d2.weightInPounds) {
            return this;
        } else {
            return d2;
        }
    }
}
