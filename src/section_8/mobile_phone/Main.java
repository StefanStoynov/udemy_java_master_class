package section_8.mobile_phone;

public class Main {

  public static void main(String[] args) {
    MobilePhone mp = new MobilePhone("00000");
    Contact c1 = new Contact("Ivo","00999");
    mp.addNewContact(c1);
    mp.printContacts();
    Contact gosho = new Contact("Gosho","000000");
    mp.addNewContact(gosho);

    mp.printContacts();
    System.out.println("----------------------------");

   Contact cont =  mp.queryContact("Gosho");
    System.out.println(cont.getName() + " " + cont.getPhoneNumber());
    Contact znew = new Contact("Stamat", "1111111");
    mp.updateContact(gosho,znew);
    mp.printContacts();
    mp.removeContact(znew);
    mp.printContacts();

  }
}
