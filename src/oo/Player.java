package oo;

public class Player {
    //attriubte - state
    int number =0;
    
    //method -behaivor
    public void guess(){
        number = (int) (Math.random() *10); //1 -10
        System.out.println("I'm guessing " + number);
    }
}
