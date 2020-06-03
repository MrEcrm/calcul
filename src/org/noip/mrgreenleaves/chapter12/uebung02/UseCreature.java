package org.noip.mrgreenleaves.chapter12.uebung02;

public class UseCreature {

    public static void main(String[] args)
    {
        Creature oneCreature = Creature.HORSE;
        Creature anotherCreature  = Creature.BIRD;

        System.out.println(oneCreature.description());
        System.out.println(anotherCreature.description());
    }
}
