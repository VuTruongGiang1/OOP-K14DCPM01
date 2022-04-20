package oo.tuan05.buoi9;

public abstract class Animal {
    
    //attribute - thuoc tinh - state
    private String picture;
    private String food;
    private int hunger;
    private String ten;

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    private String name;
     // protected abstract void beFriendly();

    // protected abstract void play();


    //method - behavior
    protected abstract void makeNoise();//hop dong nay

    protected void sleep(){
        System.out.println("Sleepingg....");//concrete method - phuong thuc cu the
    }

    protected abstract void eat();//hop dong nay

    protected void roam(){
        System.out.println("Roamingg.....");
    }
}
