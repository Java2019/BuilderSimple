package com.nemo.buildersimple;

import java.util.List;

/**
 * Created by use on 24.07.17.
 */
public class Family {

    private Father father = new Father();
    private Mother mother;
    private Daughter daughter;
    private String myFamily = "no name";

    public Family() {
        this.father = new Father();
        this.mother = new Mother();
        this.daughter = new Daughter();
    }

    @Override
    public String toString() {

        try {
            myFamily = "Father`s name is - " + father.getName() + ". \n" +
                    "Mother`s name is - " + mother.getName() + ". \n" +
                    "Daughter`s name is - " + daughter.getName() + ". ";
        } catch (Exception e){

        }
        return myFamily;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public void setMother(Mother mother) {
        this.mother = mother;
    }

    public void setDaughter(Daughter daughter) {
        this.daughter = daughter;
    }

    public Father getFather() {
        return father;
    }

    public Mother getMother() {
        return mother;
    }

    public Daughter getDaughter() {
        return daughter;
    }
}
