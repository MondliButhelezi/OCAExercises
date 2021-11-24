package chapterOne.access_modifiers.primitives;

public class PrimType {

    static java.util.Date today;
    static String greeting;

    public static void main(String[] args) {
        long max = 3123456789L; // put capital latter L for good practice
        double notAtStart = 1_000_000.0_0;

        today = new java.util.Date();
        greeting = "How are you";

        /* primitives refuse to be assigned null
           references can be assigned null
         */

//        int value = null;
        String s = null;
        double e; double b;
        int i1; int i2;
    }
}
