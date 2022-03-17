package oo;

public class Dog {
    //attribute - data

    //Implementation: private - không cho phép truy cập
    private int size;

    //default là mặc định
    String name;
    String breed;

    //methods
    //interface 
    public void setSize(int size){
        if(size >0){
            this.size = size;
        }else{
            System.out.println("Size unvalid (không hợp lệ)!!");
        }
    }

    //interface
    public int getSize(){
        return this.size;
    }
}
