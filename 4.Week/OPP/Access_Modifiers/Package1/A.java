package Package;
import Package2.*;

public class A {
    protected String proctectedMassage2 = "This is the protected";
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
         //System.out.println(c.defaultMassage);
        System.out.println(c.publicMassage3);
        //System.out.println(b.privateMassage);

    }
}
