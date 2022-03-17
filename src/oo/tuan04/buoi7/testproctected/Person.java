package oo.tuan04.buoi7.testproctected;

public class Person {
    
    private String name;
    private String birthday;

    public Person(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }

    /**
     * 
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    /**
     * 
     * @return the birthday
     */
    public String getbirthday(){
        return birthday;
    }

    /**
     * 
     * @param name the name to set
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * 
     * @return the name
     */
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return "Person [birthday=" + birthday + ", name = " + name + "]";
    }
}
