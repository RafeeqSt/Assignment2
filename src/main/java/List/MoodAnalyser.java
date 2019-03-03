package List;

import java.util.HashMap;
import java.util.Map;

public class MoodAnalyser {

    public static final Map<String, String> findWord = new HashMap();

    static{
        findWord.put("happy","laugh");
        findWord.put("sad","cry");
        findWord.put("angry","scream");
    }

    private MoodAnalyser(){}

    public static String analyseMood(String sentence)
    {
        String[] wordsInMessage = sentence.split("\\s");
        String found = null;
        for(int i=0; i<wordsInMessage.length;i++)
        {
            found = wordsInMessage[i];

            if (found.equals("happy"))
                found = "laugh";
            else if (found.equals("sad"))
                found = "cry";
            else if (found.equals("angry"))
                found = "scream";
        }

        return found;
    }
}
