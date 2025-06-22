public class recursiveforecast implements forecaststrategy {

    public double forecast(double initialvalue, double growthrate, int years) {
        if (years == 0) {
            return initialvalue;
        }
        double nextyearvalue = initialvalue * (1 + growthrate);
        return forecast(nextyearvalue, growthrate, years - 1);
    }
}
