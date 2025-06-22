package code;

public class client {
    public static void main (String args []){
        Employee employee = empfactory.getEmployee("Androiddev");
        System.out.println(employee);
        int salary = employee.salary();
        System.out.println("salary :"+salary);

        Employee employee1 = empfactory.getEmployee("webdeveloper");
        System.out.println(employee);
        System.out.println("salary :"+employee1.salary());

        Employee employee2 = empfactory.getEmployee("AssociateQA");
        System.out.println(employee);
        System.out.println("salary :"+employee2.salary());
    }
    
}
