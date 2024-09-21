public class Car {
    /** instance variables : 实例变量 */
    String model;
    int wheels;

    public Car(String m) {
        this.model = m;
        this.wheels = 4;
    }

    public void drive() {
        if(this.wheels < 4) {
            System.out.println(this.model + " no go vrooom");
        }else {
            System.out.println(this.model + " go vroom");
        }
    }

    public int getNumWheels() {
        return this.wheels;
    }

    public void driveIntoDitch(int wheelsLost) {
        this.wheels -= wheelsLost;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Civic Type R");
        Car c2 = new Car("Toyota Camry");

        c1.drive();
        c1.driveIntoDitch(2);
        c1.drive();
        System.out.println(c2.getNumWheels());
    }
}

