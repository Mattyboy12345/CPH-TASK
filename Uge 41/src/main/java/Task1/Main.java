package Task1;

public class Main {
    public static void main(String[] args){
        Driver driver = new Driver("Mathias", 22);
        Car car = new Car("Skoda Fabia", "Hashback" , 2020, "1.0");
        car.setDriver(driver);

        System.out.println(car.toString() + car.getDriver());

        Car car2 = new Car("Skoda", "Karoq", 2019, "1.8");
        car.setDriver(driver);

        System.out.println(car2.toString() + car2.getDriver());
    }
}
