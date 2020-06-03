package org.noip.mrgreenleaves.chapter15.system;

import java.util.HashMap;
import java.util.Map;

public class MoodAnalyser {
    private static final Map<String, Mood> WORD_TO_MOOD = new HashMap<>();

    static
    {
        WORD_TO_MOOD.put("happy", Mood.HAPPY);
        WORD_TO_MOOD.put("good", Mood.HAPPY);

    }

    private MoodAnalyser()
    {

    }

    public static Mood analyseMood(String sentence)
    {
        String[] wordsInMessage = sentence.split("\\s");
       // return null;
        return Mood.HAPPY;
    }
    public static void main(String[] args)
    {

    }
}
