package clinic.programming.training;


import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;


public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
    
    public int countWords(String words) {
    	String[] seperateWords = StringUtils.split(words," ");
    	return (seperateWords == null) ? 0 : seperateWords.length;
    }
    public void great() {
    	List<String> greetings = new ArrayList<>();
    	greetings.add("hello");
    	greetings.forEach(greeting -> {
    		System.out.println("Greeting: "+ greeting);
    	});
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
    	Application app = new Application();
    	app.great();
    	System.out.println("count words: "+app.countWords("I have four words"));
    }
}