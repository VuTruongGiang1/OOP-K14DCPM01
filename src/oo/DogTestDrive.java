package oo;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setSize(5);
        System.out.println("Dog size: " + dog.getSize());


        dog.name = "ZZZ";
    }
}
