package cs1302.midterm;
public class ADriver {
    public static void main (String [] args) {
        A a = new B ();
        A a1;
        B b;
        C c;
        b = (B)a;
        a1 = b;
        c = (C)a1;
    }
}
