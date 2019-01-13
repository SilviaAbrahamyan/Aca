package com.homeworks.oca.exception.others;

import java.util.*;

/**
 * Created by home on 11/22/2018.
 */
public class Palace {
//
//    public void openDrawbridge() throws Exception {
//        try {
//            throw new Exception("Problem");
//        } catch (OpenDoorException e) {
//            throw new OpenDoorException();
//        } catch (CableSnapException ex) {
//            try {
//                throw new OpenDoorException();
//            } catch (Exception ex) {
//            } finally {
//                System.out.println("Almost done");
//            }
//        } finally {
//            throw new RuntimeException("Unending problem");
//        }
    //}
    public static void main(String[] moat) throws Exception {
      //  new Palace().openDrawbridge();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(56);
        list.add(3);
        list.add(56);
        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.print(set.size());
        System.out.print(" " );
        System.out.print(set.iterator().next());

//
//        Comparator<Integer> c = (x, y) > y x;
//        List<Integer> ints = Arrays.asList(3, 1, 4);
//        Collections.sort(ints, c);
//        System.out.println(Collections.binarySearch(ints, 1));

        ArrayDeque<Integer> dice = new ArrayDeque<>();
        dice.offer(3);
        dice.offer(2);
        dice.offer(4);
        System.out.print(dice.stream().filter(n -> n != 4));
    }
}
class OpenDoorException extends Exception {}
class CableSnapException extends OpenDoorException {}