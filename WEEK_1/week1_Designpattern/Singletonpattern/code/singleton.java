package code;

public class singleton {

    private static singleton variable;

    private singleton() {
        System.out.println("Singleton instance created");
    }

    public static singleton getvariable() {
        if (variable == null) {
            synchronized (singleton.class) {
                if (variable == null) {
                    variable = new singleton();
                }
            }
        }
        return variable;
    }
}