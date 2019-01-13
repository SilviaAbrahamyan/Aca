package com.homeworks.aca_book.nested;

/**
 * Created by home on 11/13/2018.
 */
public class InheritInner extends WithInner.Inner {
    // InheritInner() {} // Won’t compile
    InheritInner(WithInner wi) {
        wi.super();
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}
class WithInner {
    class Inner {}
}