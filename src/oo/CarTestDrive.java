package oo;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarColor("Den");
        car.setCarPrice(35000000);
        System.out.println("CarColor: "+car.getCarColor());
        System.out.println("CarPrice: "+car.getCarPrice());
    }
}
