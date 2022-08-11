/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordersapplication;

/**
 *
 * @author 20pt02
 */
import java.util.*;

public class RushOrder extends Orders{
    protected int deliveryDay;
    public RushOrder(int d)
    {
        super();
        this.deliveryDay = d;
    }
    int getTotal()
    {
        int total = super.getTotal();
        switch (deliveryDay) {
            case 1:
                total += 25;
                break;
            case 2:
                total += 15;
                break;
            case 3:
                total += 10;
                break;
            default:
                total += 0;
                break;
        }
        return total;
    }
    
}
