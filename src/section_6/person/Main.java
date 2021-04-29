package section_6.person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("a");
        p.setLastName("b");
        System.out.println(p.getFullName());
    }
}
