package nl.klaasjankostelijk;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
	public void greet(){
		List<String> greetings = new ArrayList<>();
		greetings.add("Hoi");
		
		for (String greeting : greetings){
	System.out.println("Gegroet: " + greeting);}
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
		app.greet();
    }
}