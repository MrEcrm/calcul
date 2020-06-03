package org.noip.mrgreenleaves.repeat10;

public class UseFormen {
    public static void main(String[] args) {


        Formen formEins = new Regtangle(10, 13);
        Formen formZwei = new Sircle(10);

        //print

        System.out.printf("formEins hat eine Fläche von %g und einen Umfang von %g %n", formEins.getFlaeche(), formEins.getUmfang());
        System.out.printf("formZwei hat eine Fläche von %g und einen Umfang von %g %n", formZwei.getFlaeche(), formZwei.getUmfang());

        // if mit instanceof

        if(formEins instanceof Formen)
        {
            System.out.printf("formEins ist eine Instanz von Formen%n");
        }
        else
        {
            System.out.printf("formEins ist keine Instanz von Formen%n");
        }

        if(formEins instanceof Regtangle)
        {
            System.out.printf("formEins ist eine Instanz von Regtangle%n");
        }
        else
        {
            System.out.printf("formEins ist keine Instanz von Regtangle%n");
        }

        if(formEins instanceof Sircle)
        {
            System.out.printf("formEins ist eine Instanz von Sircle%n");
        }
        else
        {
            System.out.printf("formEins ist keine Instanz von Sircle%n");
        }
    }

}
