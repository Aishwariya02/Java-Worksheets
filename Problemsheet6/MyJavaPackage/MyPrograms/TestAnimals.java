package MyJavaPackage.MyPrograms;
import MyJavaPackage.MyAnimals.*;

public class TestAnimals
{
    public static void main(String args[])
    {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.walk();
        c.eat();
        System.out.println(c.getName());
        System.out.println(p.getName());
        e.walk();
        p.play();
        a.eat();
    }

}
