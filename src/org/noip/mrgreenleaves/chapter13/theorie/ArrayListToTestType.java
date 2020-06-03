package org.noip.mrgreenleaves.chapter13.theorie;
import java.util.ArrayList;

public class ArrayListToTestType {
    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList <String>();
        for (int i = 1; i <= 10; i++)
        //arrList.add("Obj" +i);
        System.out.println(arrList.add("Obj" +i));

        arrList.add(new Integer (12).toString());
          /*
        Error:(12, 21) java: incompatible types: java.lang.Integer cannot be converted to java.lang.String
         */

        System.out.println(arrList);
        // ausgabe: [Obj1, Obj2, Obj3, Obj4, Obj5, Obj6, Obj7, Obj8, Obj9, Obj10, 12]

        //clear
        arrList.clear();
        System.out.println(arrList);
        for (int i = 0; i < 10; i++)
        //add
            arrList.add("obJ" +2*i);
        System.out.println(arrList);

        //Contains
        System.out.println(arrList.contains("obJ10")); //true
        System.out.println(arrList.contains("obJ101"));//false

        //equals
        System.out.println();
        System.out.println("Hier vergleichen wir Listen");
        ArrayList<String> arrList2 = new ArrayList <String>();
        for (int i = 0; i < 10; i++)
            arrList2.add("obJ" +2*i);

        System.out.println("Hier vergleichen wir Listen: Grund-Liste arrList mit arrList2 - erwartetes Resultat: true, weil erste Liste nach löschung mit selben Inhalt bespielt wurde");
        System.out.println(arrList.equals(arrList2));

        System.out.println("Hier vergleichen wir Listen: arrList2 mit arrList3 - erwaretetes Resultat: false: kleiner Unterschied obj vs obJ");
        ArrayList<String> arrList3 = new ArrayList <String>();
        for (int i = 0; i < 10; i++)
            arrList3.add("obj" +2*i);
        System.out.println(arrList2.equals(arrList3));

        //Hashcode
        System.out.println();
        System.out.println("Hashcode der arrList3:");
        System.out.println(arrList3.hashCode());

        //Iterator Objekt
        System.out.println();
        System.out.println("Iterator der arrList3:");
        System.out.println(arrList3.iterator());

        //Remove Objekt
        System.out.println();
        System.out.println("Remove object der arrList2:");
        System.out.println(arrList2);
        System.out.println("size :"+arrList2.size());
        //all objects: [obJ0, obJ2, obJ4, obJ6, obJ8, obJ10, obJ12, obJ14, obJ16, obJ18]
        System.out.println();
        arrList2.remove("obJ4");
        System.out.println("obJ4 removed");
        System.out.println(arrList2);
        System.out.println("size :" +arrList2.size());

        System.out.println("compare the lists with equals: false!");
        System.out.println("arrlist 2 "+ arrList2);
        System.out.println("arrlist   " +arrList);
        System.out.println(arrList.equals(arrList2));
        System.out.println("remove another item and prove that it returns true");
        System.out.println(arrList2.remove("obJ6"));
        System.out.println("remove another item that does not exist and prove that it returns false");
        System.out.println(arrList2.remove("obJ634"));

        //toArray

        System.out.println();
        System.out.println("ausgabe des arrays");
        System.out.println(arrList2.toArray());
        Object[] ob = arrList2.toArray();
        for(Object value: ob)
            System.out.println(value);

        //<T> T [] toArray(T[] a) --> a copy function!
        // create a new array 4 and print its content
        System.out.println();
        System.out.println("create a new array 4 and print its content");

        ArrayList<String> arrList4 = new ArrayList <String>();
        System.out.println(arrList4.getClass().getComponentType());


        for (int i = 0; i < 10; i++)
            arrList4.add("obj" +2*(i*i));

        System.out.println("arrList 4 = " +arrList4);
        System.out.println();

        System.out.println("copy the list function");
        System.out.println("create a new String array object with the same size as arrList4");
        String arrList5[] = new String[arrList4.size()];
        System.out.println("size of the new array: " +arrList5.length);
        System.out.println(arrList5.getClass().getComponentType());
        System.out.println(arrList4.getClass().getComponentType());

        System.out.println("variable arrlist5 mit arrList4 ins arrList5 kopieren");
        arrList5 = arrList4.toArray(arrList5);
        System.out.println("ausgabe des arrList5");
        System.out.println("arrlist5 = " +arrList5);
        for(String number: arrList5)
            System.out.println(number+" "+number.length()+" "+arrList5.length);



    }
}
