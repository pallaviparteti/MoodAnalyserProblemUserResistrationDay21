package com.programstotest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserInvalidMoodTest{
	@Test
	public void givenMessage_SadMood_ShouldReturn_Sad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser ("Invalid Mood");
		String mood;
		try {
			mood =  moodAnalyser.analyseMood();
			Assertions.assertEquals("NULL", mood);
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}