package Project1.customer.customer;

public class RealCustomer extends AbstractCustomer{

    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name+" is available in Customer Database";
    }
}
