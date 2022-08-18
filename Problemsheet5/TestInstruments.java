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
interface Instrument
{
    void play();
    String what();
    void adjust();
}

class Wind implements Instrument
{
    public void play()
    {
        System.out.println("Whoosh");
    }
    public String what()
    {
        return "This is a wind instrument.";
    }
    public void adjust()
    {
        System.out.println("Adjusted");
    }
}

class Percussion implements Instrument
{
    public void play()
    {
        System.out.println("Tum Tum");
    }
    public String what()
    {
        return "This is a percussion Instrument";
    }
    public void adjust()
    {
        System.out.println("Adjusted");
    }
}

class Stringed implements Instrument
{
    public void play()
    {
        System.out.println("");
    }
    public String what()
    {
        return "This is a stringed Instrument";
    }
    public void adjust()
    {
        System.out.println("Adjusted");
    }
}

public class TestInstruments {
    
}
