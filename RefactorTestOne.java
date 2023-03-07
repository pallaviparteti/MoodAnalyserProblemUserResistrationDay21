package com.programstotest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RefactorTestOne{

	@Test
	public void givenMessage_SadMood_ShouldReturn_Sad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser ("I am in a Sad Mood");
		String mood;
		try {
			mood =  moodAnalyser.analyseMood();
			Assertions.assertEquals("Sad", mood);
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}

