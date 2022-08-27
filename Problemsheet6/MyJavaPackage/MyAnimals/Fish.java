package MyJavaPackage.MyAnimals;

public class Fish extends Animal implements Pet
{
    String name;
    public Fish(String n)
    {
        super(0);
        name = n;
    }
    public Fish()
    {
        this("");
    }
    @Override
    public void eat()
    {
        System.out.println("Fish eats fish food.");

    }
    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName(String s)
    {
        name = s;    }

    @Override
    public void play()
    {
        System.out.println("Fish plays by swimming.");
    }
    public void walk()
    {
        System.out.println("Fish cannot walk.");
    }
}
