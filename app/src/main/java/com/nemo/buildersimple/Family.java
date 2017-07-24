package com.nemo.buildersimple;

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


}
