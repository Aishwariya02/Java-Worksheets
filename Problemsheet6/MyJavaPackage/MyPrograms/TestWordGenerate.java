package MyJavaPackage.MyPrograms;
import MyJavaPackage.WordPackage.WordGenerate;

public class TestWordGenerate
{
    public static void main(String[] args)
    {
        WordGenerate WG = new WordGenerate("Hello");
        WG.RepeatEnd(3);
        WG.RepeatEnd(2);
        WG.RepeatEnd(1);
    }
}
