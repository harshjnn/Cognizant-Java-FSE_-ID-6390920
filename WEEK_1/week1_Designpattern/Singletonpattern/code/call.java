package code;

public class call {
    public static void main(String[] args) {
        singleton variable1 = singleton.getvariable();
        singleton variable2 = singleton.getvariable();

        System.out.println(variable1.hashCode());
        System.out.println(variable2.hashCode());
    }
}
