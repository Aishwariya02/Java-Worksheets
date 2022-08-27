package MyJavaPackage.MyAnimals;

public class Cat extends Animal implements Pet
{
    String name;
    public Cat(String n)
    {
        super(4);
        name = n;
    }
    public Cat()
    {
        this("");
    }
    @Override
    public void eat()
    {
        System.out.println("Cat eats Tuna");
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String s)
    {
        name = s;
    }

    @Override
    public void play()
    {
        System.out.println("Cat plays with a ball of yarn.");

    }
}
