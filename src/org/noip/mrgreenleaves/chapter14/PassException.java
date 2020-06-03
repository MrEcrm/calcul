package org.noip.mrgreenleaves.chapter14;

public class PassException {

    //Constructor PassException()
    public PassException() throws ClassNotFoundException
    //forwards it to ClassNotFoundException 'throws' triggers the exception
    {
        Class specialClass;
        specialClass = Class.forName("xxx");
        //Die Klasse xxx existiert nicht
        //specialClass = Class.forName("org.noip.mrgreenleaves.chapter14.TryAndCatch");
        //keine exception hier

    }
        public static void main(String[] args)
        {
            try {
                //neues Objekt der Klasse PassException wird erstellt
                PassException w = new PassException();
                System.out.println(Class.forName("xxx"));
                //System.out.println(Class.forName("org.noip.mrgreenleaves.chapter14.TryAndCatch"));

            }
            catch (ClassNotFoundException e)
            {
                System.out.println("Klasse nicht gefunden");
        }
            finally {
                System.out.println();
                System.out.println("finally wird immer ausgeführt.");
            }
    }
}
