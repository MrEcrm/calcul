package org.noip.mrgreenleaves.geometry;

public class TypeVerification {
    public static void main(String[] args) {
        Rectangle oneRect = new Cuboid();
        Rectangle twoRect = new Rectangle();

        if (oneRect instanceof Cuboid) {
            Cuboid oneCub = (Cuboid) oneRect; // typecast oneRect into a cuboid
            System.out.printf("This %s has a length of %g a width of %g and an area of %g%n", oneCub.getClass(), oneCub.getLength(), oneCub.getWidth(), oneCub.getArea());
        } else {
            System.out.println("This is not a Cuboid instance%n");
            System.out.println(oneRect.getClass());
        }

        if (twoRect instanceof Cuboid) {
            Cuboid twoCub = (Cuboid) twoRect;
            System.out.printf("This %s has a length of %g and a width of %g and an area of %g%n", twoCub.getClass(), twoCub.getLength(), twoCub.getWidth(), twoCub.getArea());
        } else {
            System.out.println("This is not a Cuboid instance");
            System.out.println(twoRect.getClass());
        }
    }
}
