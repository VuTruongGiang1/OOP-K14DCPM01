package oo.tuan05.buoi9;

public abstract class Animal {
    
    //attribute - thuoc tinh - state
    private String picture;
    private String food;
    private int hunger;

    //method - behavior
    protected abstract void makeNoise();//hop dong nay

    protected void sleep(){
        System.out.println("Sleepingg....");
    }

    protected abstract void eat();//hop dong nay

    protected void roam(){
        System.out.println("Roamingg.....");
    }
}
