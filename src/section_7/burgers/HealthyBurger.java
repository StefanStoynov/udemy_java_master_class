package section_7.burgers;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price) {
        super("Healthy hamburger", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1 (String name , double price){
       super.addHamburgerAddition1(name,price);
    }

    public void addHealthyAddition2 (String name , double price){
      super.addHamburgerAddition2(name, price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
