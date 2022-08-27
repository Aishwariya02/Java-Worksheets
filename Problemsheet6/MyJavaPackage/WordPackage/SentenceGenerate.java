package MyJavaPackage.WordPackage;

public class SentenceGenerate
{
    String[] articles;
    String[] noun;
    String[] verb;
    String[] preposition;

    public SentenceGenerate(String n[],String v[])
    {
        articles = new String[]{"the", "a", "one", "some", "any"};
        preposition = new String[]{"to", "from", "over", "under", "on"};
        noun = new String[5];
        verb = new String[5];
        for(int i = 0;i<5;i++)
        {
            noun[i] = n[i];
        }
        for(int j=0;j<5;j++) {
            verb[j] = v[j];
        }
    }

    public void GenerateRandom()
    {
        int max = 4;
        int min = 0;
        String str = "";
        for(int i = 0;i<6;i++)
        {
            int r1 = (int)(Math.random()*(max-min+1)+min);
            if(i == 0 || i == 4)
            {
                str += articles[r1] + " ";
            }
            else if(i == 1)
            {
                str += noun[r1] + " ";
            }
            else if(i == 2)
            {
                str += verb[r1] + " ";
            }
            else if(i == 3)
            {
                str += preposition[r1] + " ";
            }
            else if(i == 5)
            {
                str += noun[r1] +".";
            }

        }
        System.out.println(str.substring(0,1).toUpperCase() + str.substring(1));
    }
}
