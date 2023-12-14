import java.util.Arrays;

public class PearsonCorrelation {
    public static void main(String[] args) {
        double[] x = {10, 2, -23, 54, 15};
        double[] y = {62, -17, 8, 0, 10};

        double correlation = calculatePearsonCorrelation(x, y);
        System.out.println("Correlation: " + correlation);
    }

    public static double calculatePearsonCorrelation(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new RuntimeException("arrays length must be equal");
        }
        double avgX = average(x);
        double avgY = average(y);
        double dividend = 0;
        double divider = 0;
        for (int i = 0; i < x.length; i++) {
            double deviationAvgX = x[i] - avgX;
            double deviationAvgY  = y[i] - avgY;
            dividend += deviationAvgX  * deviationAvgY;
            divider += (deviationAvgX  * deviationAvgX) *
                    (deviationAvgY * deviationAvgY);
        }
        return dividend / Math.sqrt(divider);
    }

    public static double average(double[] array) {
        return (double) Arrays.stream(array).sum() / array.length;
    }
}