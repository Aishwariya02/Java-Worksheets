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
public class OrderItem 
{
    String upc;
    int quantity;
    int price;
    
    int getCost()
    {
        return quantity*price;
    }
    
}