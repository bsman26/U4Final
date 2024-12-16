

	import java.util.Scanner;

	public class MoodPredictor {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to the Mood Predictor!");
	        System.out.println("Please enter the current weather condition (sunny, rainy, cloudy, etc.):");

	   
	        String weather = scanner.nextLine().toLowerCase();

	    
	        String mood = predictMood(weather);

	        System.out.println("Based on the weather, your predicted mood is: " + mood);
	    
	        scanner.close();
	    }

	    private static String predictMood(String weather) {
	        switch (weather) {
	            case "sunny":
	                return "happy";
	            case "rainy":
	                return "gloomy";
	            case "cloudy":
	                return "thoughtful";
	            case "snowy":
	                return "excited";
	            case "windy":
	                return "energetic";
	            case "stormy":
	                return "anxious";
	            default:
	                return "neutral";
	        }
	    }
	}


