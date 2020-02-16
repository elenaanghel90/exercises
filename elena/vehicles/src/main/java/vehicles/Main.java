package vehicles;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Dacia", 100,4);//am folosit contructorul care foloseste doar 3 parametrii
        Car superCar = new Car("Tesla",1000,4,true); //am folosit contructorul caare contine toti parametrii
        Moto moto = new Moto("BMW", 500,2);

        System.out.println(car.getHorsePower());
    }
}
