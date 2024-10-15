import static java.lang.Math.sqrt;

public class Variance {
    public static double average(double[] nums) {
        double sum = 0.0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(nums.length == 0) {
            return 0;
        }
        return sum/nums.length;
    }

    public static double variance(double[] nums) {
        double a = average(nums);
        double[] squaredDifferences = new double[nums.length];
        for(int i = 0; i < nums.length;i++) {
            double difference = nums[i] - a;
            squaredDifferences[i] = difference*difference;
        }
        return average(squaredDifferences);
    }
}