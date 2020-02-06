import java.util.ArrayList;

public class groundskeepingClass {
    private String name;
    private String address;
    private String lotSize;
    private String dateHired;
    private String status;
    private String payRate;
    private ArrayList<customerClass> customers;

    public groundskeepingClass(String name, String address, String lotSize, String dateHired, String status, String payRate){
        this.name=name;
        this.address=address;
        this.lotSize=lotSize;
        this.dateHired=dateHired;
        this.status=status;
        this.payRate=payRate;
        this.customers=new ArrayList<>();
    }

    public void addCustomer(customerClass customer){
        customers.add(customer);
    }

    public ArrayList<customerClass> getCustomerList(){
        return customers;
    }
}
