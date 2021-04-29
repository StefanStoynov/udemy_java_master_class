package section_8.bank;

import java.util.ArrayList;

public class Customer {
  private String name;
  private ArrayList<Double>transactions = new ArrayList<>();

  public Customer(String name, double transaction) {
    this.name = name;
    this.transactions.add(transaction);
  }

  public String getName() {
    return name;
  }

  public ArrayList<Double> getTransactions() {
    return this.transactions;
  }

  public void addTransaction(double transaction){
    this.transactions.add(transaction);
  }
}
