package code;

public class empfactory {
    public static Employee getEmployee (String emptype){
        if (emptype.equalsIgnoreCase("Androiddev")){
            return new Androiddev();
        }
        else if (emptype.equalsIgnoreCase("webdeveloper")){
            return new webdeveloper();
        }
        else if (emptype.equalsIgnoreCase("AssociateQA")){
            return new AssociateQA();
        }
        else{
            return null;
        }


    }
    
}
