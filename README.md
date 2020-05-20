# Demonstration of Java Language Specification 3.10.5

Details can be seen from [this](https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-3.10.5) link.

```
package testPackage;

class Test {
    public static void main(String[] args) {
        String hello = "Hello", lo = "lo";
        System.out.print((hello == "Hello") + " ");
        System.out.print((Other.hello == hello) + " ");
        System.out.print((other.Other.hello == hello) + " ");
        System.out.print((hello == ("Hel"+"lo")) + " ");
        System.out.print((hello == ("Hel"+lo)) + " ");
        System.out.println(hello == ("Hel"+lo).intern());
    }
}

class Other { 
    static String hello = "Hello";
}
```
```
package other;

public class Other { 
    public static String hello = "Hello";
}
```

produces the output:
``
true true true true false true
``


> This example illustrates six points:
> 
> Literal strings within the same class (§8 (Classes)) in the same package (§7 (Packages)) represent references to the same String object (§4.3.1).
> 
> Literal strings within different classes in the same package represent references to the same String object.
> 
> Literal strings within different classes in different packages likewise represent references to the same String object.
> 
> Strings computed by constant expressions (§15.28) are computed at compile time and then treated as if they were literals.
> 
> Strings computed by concatenation at run time are newly created and therefore distinct.
> 
> The result of explicitly interning a computed string is the same string as any pre-existing literal string with the same contents.
