package org.noip.mrgreenleaves.chapter12.uebung;

public enum Creature {
    SPIDER(8), INSECT(6), HORSE(4), BIRD(2), SNAKE(0), FISH(0);

    int legs= 0;
    Creature(int legs)
    {
        this.legs=legs;
    }

    int getLegs()
    {
        return legs;
    }

    public String description()
    {
        String s = this.toString().toLowerCase();
        s = s.substring(0,1).toUpperCase() + s.substring(1);
        s = s+ "s have ";
        if(getLegs()>0)
        {
            s = s +getLegs();
        }
        else
        {
            s= s+ "no";
        }

        return s + " legs.";

    }
}
