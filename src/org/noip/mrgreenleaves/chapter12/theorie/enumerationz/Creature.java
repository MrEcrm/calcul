package org.noip.mrgreenleaves.chapter12.theorie.enumerationz;

public enum Creature {
    SNAKE(0), LIZARD(4), FISH(0), SPIDER(8), INSECT(6);

    //define the variable
    private int legs;

    //make a Constructor

    Creature(int legs)
    {
        //setter nimmt legs entgegen --> spezieller Konstruktor
        this.legs=legs;
    }

    //getter

    int getLegs()
    {
        return legs;

    }

    //ausgabe-Inhalt logik machen mit To string
    public String description()
    {
        //Name des Aufzählungselement wird in tostring ausgegeben --> tier
        String s = this.toString() + "s have ";

        //Unterscheide ob das Tier überhaupt beine hat
        if(getLegs() >0)
            // s= spiders have --> s = s+getLegs() = spiders have 8
            s = s + getLegs();
        else
            // S= snakes vae ---> s = s+getLegs() = snakes have no
            s = s + "no";

        // s= snakes have no --> snakes have no legs
        return s + " legs.";
    }


}
