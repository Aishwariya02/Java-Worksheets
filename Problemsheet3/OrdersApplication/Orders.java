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

public class Orders
{
    List<OrderItem> orderList;
    public Orders()
    {
        this.orderList = new ArrayList();
    }
    void addOrderItem(OrderItem O1)
    {
        this.orderList.add(O1);
    }
    int getTotal()
    {
        int total = 0;
        for(int i = 0;i<orderList.size();i++)
        {
            total += orderList.get(i).getCost();
        }
        return total;
    }
    void printOrderItems()
    {
        for(int i = 0;i<orderList.size();i++)
        {
            System.out.println(orderList.get(i));
        }
    }
}
