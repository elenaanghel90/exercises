package person;

public class Staff extends Person {
    private String school;
    public double pay;


    public Staff(String name, String address,String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;

    }

    public String getSchool() {
        return school;
    }

    public void setSchool() {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay() {
        this.pay = pay;
    }
    @Override
    public String toString(){
        return "The staff " +  super.toString() + " which is working for the school" + this.school + "and is paying with " + this.pay;
    }
}
