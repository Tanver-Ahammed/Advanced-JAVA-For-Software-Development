package staticFinal;

public class StaticClass {
    static int number = 5;
    int objMember;

    public void normalMethod() {
        number += 50;
    }

    public static void staticMethod() {
        number += 105;
    }
}
