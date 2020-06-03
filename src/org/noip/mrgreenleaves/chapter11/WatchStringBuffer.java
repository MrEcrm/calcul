package org.noip.mrgreenleaves.chapter11;

public class WatchStringBuffer {
    public static void main(String[] args)
    {

        /*
        StringBuffer();
        StringBuffer(int i = 32);
        StringBuffer(String "text");

         */



        StringBuffer sb = new StringBuffer("Text123456789011121314151617");
        String s = sb.toString();
        System.out.println(s);

        StringBuffer sb2 = new StringBuffer("test3");
        String s2 = new String(sb2);
        System.out.print(sb2);
        System.out.println();

        StringBuffer a;
        a = new StringBuffer();
        a.append("1 + 2 = ");
        a.append(3);
        System.out.println(a);
        System.out.println();

        int i = a.capacity();
        System.out.println(i);

        char c = a.charAt(2);
        System.out.println(c);
        char b = sb2.charAt(3);
        System.out.println(b);

        sb2.setCharAt(3, 'q');
        System.out.println(sb2);

        StringBuffer a2;
        a2 = new StringBuffer();
        a2.append("1+2=");
        a2.append(1+2);
        System.out.println(a2);
        a2.insert(0, "(");
        a2.insert(6, ")");
        System.out.println(a2);

        int i1 = a2.length();
        System.out.println(i1);

        String s1 = a2.toString();
        System.out.println(a2);




    }
}
