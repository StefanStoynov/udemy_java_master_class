package section_6.vip_customer;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default Name",0.0,"default@email.com");
    }

    public VipCustomer(String name,double creditLimit){
        this(name,creditLimit,"default@email.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

}
