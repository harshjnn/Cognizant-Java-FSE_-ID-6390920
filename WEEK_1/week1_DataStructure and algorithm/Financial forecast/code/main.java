public class main {
    public static void main(String[] args) {
        forecastrequest request = new forecastrequest(1000, 0.05, 5);

        forecastservice service = new forecastservice();
        double iterativevalue = service.calculatefuturevalue(
                request.getinitialvalue(),
                request.getgrowthrate(),
                request.getyears()
        );

        outputhelper.show("iterative forecast value: ₹" + String.format("%.2f", iterativevalue));

        forecaststrategy strategy = new recursiveforecast();
        double recursivevalue = strategy.forecast(
                request.getinitialvalue(),
                request.getgrowthrate(),
                request.getyears()
        );

        outputhelper.show("recursive forecast value: ₹" + String.format("%.2f", recursivevalue));
    }
}
