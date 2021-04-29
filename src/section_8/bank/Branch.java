package section_8.bank;

import java.util.ArrayList;

public class Branch {
  private String name;
  private ArrayList<Customer> customers;

  public Branch(String name) {
    this.name = name;
    customers = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public ArrayList<Customer> getCustomers() {
    return this.customers;
  }

  public boolean newCustomer(String customerName, double transaction){
    Customer newCustomer = new Customer(customerName,transaction);
    Customer existingCustomer = findCustomer(customerName);

    if (existingCustomer == null){
      this.customers.add(newCustomer);
      return true;
    }
    return false;
  }

  public boolean addCustomerTransaction(String customerName, double transaction){
    Customer existingCustomer = findCustomer(customerName);
    if (existingCustomer!=null){
      existingCustomer.addTransaction(transaction);
      return true;
    }
    return false;
  }

  private Customer findCustomer (String customerName){
//    return this.customers.stream().filter(customer -> {
//      if (customer.getName().equals(customerName)){
//        return true;
//      }
//      return false;
//
//    }).findFirst().orElse(null);

    for (int i = 0; i < customers.size(); i++) {
      if (customers.get(i).getName().equals(customerName)){
        return customers.get(i);
      }
    }
    return null;
  }
}
