package problemsheet5;

/**
 *
 * @author 20PT02
 */

abstract class Question
{
    String myText;
    Question(String s)
    {
        myText = s;
    }
    String getText()
    {
        return myText;
    }
    abstract String getQuestion();
    abstract String getAnswer();
    abstract boolean checkAnswer();
}

class ShortAnswerQuestion extends Question
{
    String myAnswer; 
    ShortAnswerQuestion(String text)
    {
        super(text);
    }
    @Override
    String getQuestion()
    {
        return getText();
    }
    
    @Override
    String getAnswer()
    {
        return myAnswer;
    }
    @Override
    boolean checkAnswer()
    {
        return true;
    }
}

class FillInTheBlankQuestion extends Question
{
    String myAnswer;
    FillInTheBlankQuestion(String text, String ans)
    {
        super(text);
        myAnswer = ans;
    }
    @Override
    String getQuestion()
    {
        return getText() + "\nFill in the blank.";
    }
    @Override
    String getAnswer()
    {
        return myAnswer;
    }
    @Override
    boolean checkAnswer()
    {
        return getAnswer().equalsIgnoreCase("true");
    }
    
}

class TrueFalseQuestion extends Question
{
    boolean myAnswer;
    TrueFalseQuestion(String s,boolean ans)
    {
        super(s);
        myAnswer = ans;
    }
    @Override
    String getQuestion()
    {
        return getText() + "\nIs this statement true or false?";
    }
    @Override
    String getAnswer()
    {
        String answer =  Boolean.toString(myAnswer);
        return answer;
    }
    @Override
    boolean checkAnswer()
    {
        return getAnswer().equalsIgnoreCase("true");
    }
}


public class TestQuestion 
{
    
}
