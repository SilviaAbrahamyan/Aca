package com.homeworks.oca.exception.encapsulatemethods.wardrobe;

/**
 * Created by home on 11/14/2018.
 */
import static com.homeworks.oca.exception.encapsulatemethods.clothes.Bank.*;
public class Teller {
    public void processAccount(int depositSlip, int withdrawalSlip) {
        withdrawal(withdrawalSlip);
        deposit(depositSlip);
    }
}
