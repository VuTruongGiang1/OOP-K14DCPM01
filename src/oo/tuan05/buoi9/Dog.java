package oo.tuan05.buoi9;

//implementation
public class Dog extends Animal{
    @Override
    protected void makeNoise() {
        System.out.println("Making gau gau...");
        
    }

    @Override
    protected void eat() {
        System.out.println("Eating pone.....");
        
    }

    //bo sung hanh vi
    public void protectHouse(){
        System.out.println("Protecting....");
    }

    public void chaseCat(){
        System.out.println("Chasing cat....");
    }
}
