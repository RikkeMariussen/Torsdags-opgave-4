import java.util.ArrayList;
import java.util.Scanner;

public class Task4and5{
	
	public static void main (String [] args){
	
	
	ArrayList<String> actions = new ArrayList<>();
	//This is what makes it a client class cause it references to another
	
	
	
	actions.add("1) Start game");
	actions.add("2) Resume game");
	actions.add("3) Pause game");
	actions.add("4) End game");
	
	// System.out.print(actions.get(0)); 
	// expected output: "Start game"
		
	GameMenu gm1 = new GameMenu(actions); 
	
	gm1.displayMenu();
	gm1.getAction();
	
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