package oo.tuan04.buoi7;

public class Shape {
    
    //attribute
    //implementation
    private String soundFile;//Xuan - ha - thu - dong

    /**
     * 
     * @param soundFile the soundFile to set
     */
    public void setSoundFile(String soundFile){
        this.soundFile = soundFile;
    }

    /**
     * 
     * @return the soundFile
     */
    public String getSoundFile(){
        return soundFile;
    }

    public Shape(){

    }

    public Shape (String soundFile){
        this.soundFile = soundFile;
    }

    /**default */ void rorate(){
        System.out.println("Rotating 360 .....");
    }

    void playSound(){
        System.out.println("Play file .aif" +this.soundFile + "music");
    }
}
