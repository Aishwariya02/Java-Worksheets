/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsheet5;

/**
 *
 * @author 20PT02
 */
class PurchaseItem
{
    String name;
    double unitPrice;
    
    PurchaseItem()
    {
        name = "No Item";
        unitPrice = 0;
    }
    PurchaseItem(String n, double p)
    {
        name = n;
        unitPrice = p;
    }
    double getPrice()
    {
        return unitPrice;
    }
    public String toString()
    {
        return name + "@" + unitPrice;
    }
} 

class WeightedItem extends PurchaseItem
{
    double weight;
    WeightedItem(String n,double p, double w)
    {
        super(n,p);
        weight = w;
    }
    @Override
    double getPrice()
    {
        return super.getPrice()*weight;
    }
    @Override
    public String toString()
    {
        return super.toString() + " " + weight + " Kg " + getPrice() + " SR";
    }
}

class CountedItem extends PurchaseItem
{
    int quantity;
    CountedItem(String n,double p,int q)
    {
        super(n,p);
        quantity = q;
    }
    @Override
    double getPrice()
    {
        return super.getPrice()*quantity;
    }
    @Override
    public String toString()
    {
        return super.toString() + " " + quantity + " Units " + getPrice() + " SR";
    }
}

public class PurchaseApplication 
{
    public static void main(String args[])
    {
        PurchaseItem I1 = new PurchaseItem();
        WeightedItem I2 = new WeightedItem("Rice",4.75,5);
        CountedItem I3 = new CountedItem("Oreo",20,8);
        System.out.println(I1);
        System.out.println(I2);
        System.out.println(I3);
    }
}
