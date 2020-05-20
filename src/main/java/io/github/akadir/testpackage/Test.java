package io.github.akadir.testpackage;

/**
 * @author akadir
 * Date: 20.05.2020
 * Time: 21:24
 */
class Test {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        System.out.print((hello == "Hello") + " ");
        System.out.print((Other.hello == hello) + " ");
        System.out.print((io.github.akadir.other.Other.hello == hello) + " ");
        System.out.print((hello == ("Hel" + "lo")) + " ");
        System.out.print((hello == ("Hel" + lo)) + " ");
        System.out.println(hello == ("Hel" + lo).intern());
    }
}

class Other {
    static String hello = "Hello";
}