package MyJavaPackage.WordPackage;

public class WordGenerate
{
    String word;
    public WordGenerate(String x)
    {
        word = x;
    }
    public void RepeatEnd(int n)
    {
        String repeat = "";
        for(int i = 0;i<n;i++)
        {
            for(int j = word.length() - n;j<word.length();j++)
            {
                repeat += word.charAt(j);
            }
        }
        System.out.println(repeat);
    }
}
