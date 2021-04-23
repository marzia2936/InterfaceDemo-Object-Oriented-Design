package package1;
public class GeneralCustomer implements IDiscount {

    @Override
    public void eid_discount() {
        System.out.println("5%");
    }

    @Override
    public void puja_discount() {
        System.out.println("3%");
    }
    
}
