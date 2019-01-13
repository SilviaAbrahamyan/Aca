package com.homeworks.oca.exception.encapsulatemethods;

/**
 * Created by home on 11/14/2018.
 */
public class Gift {
    private final Object contents = null;

    public Gift() {
    }

    protected Object getContents() {
        return contents;
    }
  //  protected void setContents(Object contents) {
  //      this.contents = contents;
  //  }
    public void showPresent() {
        System.out.print(""+contents);
    }
    public static void main(String[] treats) {
        Gift gift = new Gift();
       // gift.setContents(gift);
        gift.showPresent();
    }
}
