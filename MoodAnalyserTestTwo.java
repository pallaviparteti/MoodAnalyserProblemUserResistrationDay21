package com.programstotest;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTestTwo{
	@Test
	public void givenMessage_SadMood_ShouldReturn_Sad() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser ("I am in any Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);

	}

}