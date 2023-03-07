package com.programstotest;

public class MoodAnalyserInvalidMood {
	public class MoodAnalyser {
		private String message;
		// user default as well as parameterized cunstructor  and defined the function
		// which return the value as happy and sad
		public MoodAnalyser(String message) {

			this.message = message;
		}
		public String analyseMood() throws MoodAnalysisException {
			try {
				if(message == null)
					return null;
			}
			/*if(this.message.contains( "sad"))
					return "SAD";
				else
					return "Happy";
			}*/
			catch(NullPointerException e) {
				System.out.println(e);
				System.out.println("Invalid Mood");
			}
			return message;
		}
	}
}

