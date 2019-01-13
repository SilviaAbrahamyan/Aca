package com.homeworks.aca_book.interfaceexamples;

/**
 * Created by home on 11/14/2018.
 */
public class Task4 extends Task4Abstract{
    protected void print() { System.out.println("Task4"); }

}
class Task41 extends Task4Abstract1{
    protected void print() {  System.out.println("Task41"); }
}
abstract class Task4Abstract{

}
abstract class Task4Abstract1{
    abstract protected void print();

}

 class Ex4 {
    public static void testPrint(Task4Abstract d) {
        ((Task4)d).print();
    }
    public static void secondTestPrint(Task4Abstract1 sd) {
        sd.print();
    }
    public static void main(String[] args) {
        Task4 s = new Task4();
        Ex4.testPrint(s);
        Task41 ss = new Task41();
        Ex4.secondTestPrint(ss);
    }
}