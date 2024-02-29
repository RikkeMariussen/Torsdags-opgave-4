import java.util.ArrayList;

public class Task4{
	
	public static void main (String [] args){
	
	ArrayList<String> actions = new ArrayList<>();
	//This is what makes it a client class cause it references to another
	
	
	
	actions.add("Start game");
	actions.add("Resume game");
	actions.add("Pause game");
	actions.add("End game");
	
	
	System.out.print(actions.get(0)); 
	// expected output: "Start game"
	
	
	//GameMenu gm1 = new GameMenu(actions); 
	
	}
	
	
	
	//Dette printer Start game pga. 0
	/*
	
	ArrayList<String> actions = new ArrayList<>();
	
	actions.add("Start game");
	actions.add("Resume game");
	actions.add("Pause game");
	actions.add("End game");
	
	
	System.out.print(actions.get(0)); 
	// expected output: "Start game"
	
	*/
	
}