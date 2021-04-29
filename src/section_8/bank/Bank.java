package section_8.bank;

import java.util.ArrayList;

public class Bank {

  private String name;

  private ArrayList<Branch> branches;

  public Bank(String name) {
    this.name = name;
    branches = new ArrayList<>();
  }

  public boolean addBranch(String branchName) {
    Branch branch = new Branch(branchName);
    Branch existingBranch = findBranch(branchName);
    if (existingBranch == null) {
      this.branches.add(branch);
      return true;
    }
    return false;
  }

  public boolean addCustomer(String branchName, String customerName, double transaction) {
    Branch branch = findBranch(branchName);
    if (branch != null) {
      return branch.newCustomer(customerName, transaction);
    }
    return false;
  }

  public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
    Branch branch = findBranch(branchName);

    if (branch != null) {
     return branch.addCustomerTransaction(customerName, transaction);
    }

    return false;
  }

  public boolean listCustomers(String branchName, boolean printTransactions) {
    Branch branch = findBranch(branchName);

    if (branch != null) {
      System.out.println("Customer details for branch " + branchName);
      ArrayList<Customer> customers = branch.getCustomers();
      for (int i = 0; i < customers.size(); i++) {
        Customer customer = customers.get(i);
        System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
        if (printTransactions) {
          System.out.println("Transactions");
          ArrayList<Double> transactions = customer.getTransactions();
          for (int j = 0; j < transactions.size(); j++) {
            System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
          }
        }
      }
      return true;
    }
    return false;
  }

  private Branch findBranch(String branchName) {
//    return this.branches.stream().filter(branch -> {
//      if (branch.getName().equals(branchName)) {
//        return true;
//      }
//      return false;
//    }).findFirst().orElse(null);

    for (int i = 0; i < this.branches.size(); i++) {
      if (branches.get(i).getName().equals(branchName)){
        return branches.get(i);
      }

    }
    return null;
  }
}
