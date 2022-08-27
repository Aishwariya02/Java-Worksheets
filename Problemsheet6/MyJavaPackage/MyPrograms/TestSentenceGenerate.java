package MyJavaPackage.MyPrograms;
import MyJavaPackage.WordPackage.SentenceGenerate;
import java.util.Scanner;

public class TestSentenceGenerate
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("RANDOM SENTENCE GENERATOR");
        String[] nouns = new String[5];
        String[] verbs = new String[5];
        System.out.println("Enter five nouns:");
        for(int i = 0;i<5;i++)
        {
            String s1 = sc.nextLine();
            nouns[i] = s1;
        }
        System.out.println("Enter five verbs:");
        for(int i = 0;i<5;i++)
        {
            String s1 = sc.nextLine();
            verbs[i] = s1;
        }
        SentenceGenerate SG = new SentenceGenerate(nouns,verbs);
        System.out.println("20 Random Sentences: \n");
        for(int i = 0;i<20;i++)
        {
            SG.GenerateRandom();
        }
    }
}
