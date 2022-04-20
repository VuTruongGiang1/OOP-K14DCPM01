package oo.tuan05.buoi9;

public class Cat extends Feline implements Pet {
    @Override
    public void makeNoise() {

        System.out.println("Cat sound ...");
        
    }

    @Override
    protected void eat() {

        System.out.println("Cat eating ....");
        
    }

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

    @Override
    public void betFriendLy() {
        // TODO Auto-generated method stub
        
    }
}
