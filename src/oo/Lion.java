package oo;

public class Lion extends Animal{
    
    //state

    //method
    @Override
    protected void makeNoise() {
        // code moi danh cho Lion
        System.out.println("Making Lion noise");
    }

    @Override
    protected void eat() {
        System.out.println("Lion eating meat...");
    }
}
