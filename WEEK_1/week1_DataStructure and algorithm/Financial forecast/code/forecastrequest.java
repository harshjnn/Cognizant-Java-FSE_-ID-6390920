public class forecastrequest {
    private double initialvalue;
    private double growthrate;
    private int years;

    public forecastrequest(double initialvalue, double growthrate, int years) {
        this.initialvalue = initialvalue;
        this.growthrate = growthrate;
        this.years = years;
    }

    public double getinitialvalue() { return initialvalue; }
    public double getgrowthrate() { return growthrate; }
    public int getyears() {
         return years;
     }
}
