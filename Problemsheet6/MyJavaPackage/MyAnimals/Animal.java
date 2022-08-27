package MyJavaPackage.MyAnimals;

public abstract class Animal
{
    protected int legs;
    protected Animal(int l)
    {
        legs = l;
    }
    public abstract void eat();
    public void walk()
    {
        System.out.println("This animal walks with "+ legs + " legs.");
    }
}
