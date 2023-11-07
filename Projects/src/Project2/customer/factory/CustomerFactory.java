package Project2.customer.factory;

import Project2.customer.customer.*;

public class CustomerFactory {
    public final static String[] NAMES = {"Jhon", "Bob", "Peter", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for(String e : NAMES){
            if(e.equals(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
