package section_6.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.getAge();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (this.firstName == null && this.lastName == null) {
            return "";
        }
        if (this.firstName == null) {
            return this.lastName;
        }
        if (this.lastName == null) {
            return this.firstName;
        }
        return this.firstName + " " + this.lastName;
    }

}
