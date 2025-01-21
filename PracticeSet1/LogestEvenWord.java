
import java.util.ArrayList;
public class LogestEvenWord{

    public static String LogestEvenWords(String sentense)
    {
        String words="";
        String[] word=sentense.split(" ");
        ArrayList<String> evenWords= new ArrayList<>();
        for(String ev:word)
        {
            if(ev.length()%2==0)
            {
                evenWords.add(ev);
            }
        }
        if(evenWords.isEmpty())
        {
            words="00";
        }
        else
        {
            for(String wd:evenWords)
            {
                if(words.length()<wd.length())
                {
                    words=wd;
                }
            }
        }
        if(sentense=="")
        {
            words="00";
        }
        return words;
    }

    public static void main(String[] args)
    {
            String result=LogestEvenWords("This is Rajan Kumar");
            System.out.println(result);
    }
}