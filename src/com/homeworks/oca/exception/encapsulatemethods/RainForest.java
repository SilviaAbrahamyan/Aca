package com.homeworks.oca.exception.encapsulatemethods;

/**
 * Created by home on 11/14/2018.
 */
public class RainForest extends Forest {


    public RainForest(long treeCount) {
        super(treeCount);
    }

    public static void main(String[] birds) {
        System.out.print(new RainForest(5).treeCount);
    }
}
class Forest {
    public long treeCount;

    public Forest(long treeCount) {
        this.treeCount = treeCount + 2;
    }
}