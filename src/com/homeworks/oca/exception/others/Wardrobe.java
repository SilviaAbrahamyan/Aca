//package com.homeworks.oca.exception.others;
//
///**
// * Created by home on 11/23/2018.
// */
//public class Wardrobe {
//    abstract class Sweater extends TShirt {
//        int insulate() {return 5;}
//    }
//    private static void dress() {
//        class A{
//
//        }
//        class Jacket extends Sweater { // v1
//            int insulate() {return 10;}
//        };
//        final TShirt outfit = new Jacket() { // v2
//            int insulate() {return 20;}
//        };
//        System.out.println("Insulation:"+outfit.insulate());
//    }
//    public static void main(String... snow) {
//        new Wardrobe().dress();
//    }
//}
//abstract class TShirt {
//    abstract int insulate();
//    public TShirt() {
//        System.out.print("Starting...");
//    }
//}