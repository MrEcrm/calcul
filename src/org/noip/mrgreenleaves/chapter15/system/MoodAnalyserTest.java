package org.noip.mrgreenleaves.chapter15.system;

import org.junit.Assert;

import static org.junit.Assert.*;

public class MoodAnalyserTest {

    //https://www.youtube.com/watch?v=QDFI19lj4OM
    /*
    @org.junit.Test
    public void analyseMood() {
    }

     */
    public void shouldAnalyseHappyMessages() throws Exception{
        //MoodAnalyser.analyseMood("This is a happy message");
        Mood actual = MoodAnalyser.analyseMood("This is a happy message");

        Assert.assertEquals(Mood.HAPPY, actual);
    }


}