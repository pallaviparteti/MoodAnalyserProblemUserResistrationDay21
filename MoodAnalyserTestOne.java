package com.programstotest;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class MoodAnalyserTestOne{

	@Test
	public void givenMessage_SadMood_ShouldReturn_Sad() throws MoodAnalysisException {
		MoodAnalyser moodAnalyser = new MoodAnalyser ("I am in a Sad Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("Sad", mood);

	}
}

