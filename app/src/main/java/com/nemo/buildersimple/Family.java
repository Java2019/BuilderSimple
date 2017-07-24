package com.nemo.buildersimple;

import java.util.List;

/**
 * Created by use on 24.07.17.
 */
public class Family {

    private Father father;
    private Mother mother;
    private Daughter daughter;

    @Override
    public String toString() {

        String myFamily = "";

        myFamily = "Father`s name is - " + father.getName() + ". " +
                "Mother`s name is - " + mother.getName() + ". " +
                "Daughter`s name is - " + daughter.getName() + ". ";

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
}
