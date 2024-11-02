package org.neoteric.java.cyclic;

public class CyclicDependency {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();

        b.a=a;
        a.b=b;
    }
}
