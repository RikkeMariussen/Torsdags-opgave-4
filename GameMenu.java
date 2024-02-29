import java.util.ArrayList;
import java.util.Scanner;


class GameMenu{ 
// This is an entity class

private ArrayList<String> actions = new ArrayList<>();

public GameMenu(ArrayList<String> actions){
	this.actions = actions;
}

	public void displayMenu(){
		System.out.println("GameMenu - Please choose one of the following:");
		
		for(String options : actions){
			System.out.println(options);
		}
	}

	public void getAction(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a number to choose an action:");
		
		String input = scan.nextLine();
		
		int chosen = Integer.parseInt(input);
		
		 
		if (input.matches("\\d")){
			if (chosen == 1){
				System.out.println("You have chosen: " + actions.get(0));
			}else if (chosen == 2){
				System.out.println ("You have chosen: " + actions.get(1));
			}else if (chosen == 3){
				System.out.println ("You have chosen: " + actions.get(2));
			}else if (chosen == 4){
				System.out.println ("You have chosen: " + actions.get(3));
			}else if (chosen > 4){
				System.out.println ("Error, please insert a numeric value between 1 and 4!");
				getAction();
		}else{
			System.out.println("Error, please insert a numeric value between 1 and 4!");
			getAction();
		}
		
		
		
		//return this.actions;
	
		}
		
	}

	/*public void setActions (String actions){
			this.actions = actions;
	
		}*/

}

