package person;

public class Person {
    private  String name;
    private String address;


    public Person(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString(){
        return " is a person with the name " + this.name + " has the address: " + this.address;
    }
}
