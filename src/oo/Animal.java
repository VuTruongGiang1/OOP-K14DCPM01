package oo;

public class Animal {
    
    //attribute - thuoc tinh - state
    private String picture;
    private String food;
    private int hunger;//muc do doi

    //method - behavior
    protected void makeNoise(){
        System.out.println("making noise ....");
    }

    protected void sleep(){
        System.out.println("Sleeping ....");
    }

    protected void eat(){
        System.out.println("Eating .....");
    }

    protected void roam(){
        System.out.println("Roaming .....");
    }
}
