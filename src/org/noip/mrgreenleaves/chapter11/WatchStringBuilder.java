package org.noip.mrgreenleaves.chapter11;

public class WatchStringBuilder {
    public static void main(String[] args)
    {

        StringBuilder sbb = new StringBuilder("asdkjfkljs jaklsdjfkljd fasklkljdsklfj lkjfkjsd lfjaklsdj fjk kajdfkljakldjflk j jkljsfjkfjklsjdflkjskladjfwpoejfmsknmcmjiofjka fjkfjjfkjaslfjkljdfkl kljfkljsdkflj afjklajfkljafkljasdklfjklajdfkljaklfjklafjkljflkjafkljaljfkljwiojriojwfslynfkjijaklfjkldjfklsjfjirouwjejafkfnklefjkfn,.vmyxjojrfkl,xcjejasfisodjksdmnfdaklfj jdfkjk asdkfjkl a sdfja fl sadf lkjfaklsdj  jlkjflaskjdflkjasdklfj kljsdkljflkdjfklja  kl jkldfjkljf2ieufadkkljfkdjfklfjfkjasdflklasdjfkl");
        String c = sbb.toString();
        System.out.println(c);
        System.out.println(sbb.capacity());
        System.out.println(sbb.length());


        StringBuilder sbc = new StringBuilder();
        sbc.append("1+2 = ");
        System.out.println(sbc);
        sbc.append(1+2);
        System.out.println(sbc);

        System.out.println(sbc.charAt(4));
        System.out.println(sbc.capacity());

        sbc.setCharAt(2, ' ');
        System.out.println(sbc);

        System.out.println(sbc.length());


        
    }
}
