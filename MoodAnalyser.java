package com.programstotest;

public class MoodAnalyser {
	private String message;
	// user default as well as parameterized cunstructor  and defined the function
	// which return the value as happy and sad
	public MoodAnalyser(String message) {
		// TODO Auto-generated constructor stub
		this.message= message;
	}
	public String analyseMood() throws MoodAnalysisException {
		try {
			if(this.message.contains("sad"))
				return "SAD";
			else
				return "Happy";
		}
		catch(Exception e) {
			System.out.println(analyseMood());

		}
		return message;
	}
}

