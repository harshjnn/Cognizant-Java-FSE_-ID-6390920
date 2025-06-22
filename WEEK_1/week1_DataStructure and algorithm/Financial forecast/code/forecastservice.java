public class forecastservice {

    public double calculatefuturevalue(double initialvalue, double growthrate, int years) {
        double value = initialvalue;
        for (int i = 0; i < years; i++) {
            value *= (1 + growthrate);
        }
        outputhelper.show("iterative forecast completed.");
        return value;
    }
}
