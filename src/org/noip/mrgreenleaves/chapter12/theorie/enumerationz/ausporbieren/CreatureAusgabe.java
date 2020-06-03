package org.noip.mrgreenleaves.chapter12.theorie.enumerationz.ausporbieren;
import org.noip.mrgreenleaves.chapter12.theorie.enumerationz.Creature;

import static org.noip.mrgreenleaves.chapter12.theorie.enumerationz.Creature.*;

import static org.noip.mrgreenleaves.chapter12.theorie.enumerationz.ausporbieren.Test.*;

public class CreatureAusgabe {

    public static void main(String[] args)
    {
        //create 2 creature variables

        Creature oneCreature = SNAKE;
        Creature aontherCreature = SPIDER;
        System.out.println(oneCreature.description());
        System.out.println(aontherCreature.description());

    }
}
