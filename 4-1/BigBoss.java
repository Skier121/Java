package bigboss;

import manager.Manager;

import java.io.IOException;

public class BigBoss extends Manager {
    private String wordOfWill;

    public BigBoss(String firstName,String lastName,String profession,double salary,String project,String manage,String word)
            throws IOException {
        super(firstName,lastName,profession,salary,project,manage);
        this.wordOfWill=word;
    }
    public void setWodrOfWill(String word){
        this.wordOfWill=word;
    }

    public String SayWordOfWill(){
        return this.wordOfWill;
    }
}
