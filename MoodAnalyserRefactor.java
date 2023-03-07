package com.programstotest;

public class MoodAnalyserRefactor {
	private String message;
	// user default as well as parameterized cunstructor  and defined the function
	// which return the value as happy and sad
	public MoodAnalyserRefactor() {
	}
	public MoodAnalyserRefactor(String message) {
		this.message = message;
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

