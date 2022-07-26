/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20pt02
 */
public class Car 
{
    float fuelEfficiency;
    float fuelLevel;
    
    public Car(float fe)
    {
        this.fuelEfficiency = fe;
        this.fuelLevel = 0;
    }
    public void tank(float flevel)
    {
        this.fuelLevel+= flevel;
    }
    public void drive(float miles)
    {
        float consumed = miles/this.fuelEfficiency;
        this.fuelLevel -= consumed;
    }
    public float getFuelLevel()
    {
        return this.fuelLevel;
    }
    
    public static void main(String[] args)
    {
        Car mycar = new Car(29); // 29 miles per gallon
        mycar.tank(20); // tank 20 gallons
        mycar.drive(100); // drive 100 miles
        System.out.println(mycar.getFuelLevel()); 

    }
    
}
