package org.noip.mrgreenleaves.chapter12.uebung;

public class UseCreature {


    public static void main(String[] args)
    {
        Creature oneCreature = Creature.SPIDER;
        Creature anotherCreature = Creature.HORSE;
        System.out.println(oneCreature.description());
        System.out.println(anotherCreature.description());

    }
}
