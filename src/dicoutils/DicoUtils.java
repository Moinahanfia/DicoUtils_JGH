package dicoutils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class DicoUtils {
	
	
	
	public static void main(String[] args){
		//---------------------------------mettre les variables en private-----------------------------------
		
		
		boolean exit = false ;
		DicoLoader load = new DicoLoader();                  
		MethodeMenu methodemenu = new MethodeMenu();
		DicoIhm ihm = new DicoIhm();
		ihm.display("bienvenu !");
		String choice;
		int intChoice;
		
		//dico = loader.loadFile("....txt") buffer and reader
		
		ihm.displayMenu;
		
		
		
		
		//---------------------------------tant qu'on ne quitte pas (!exit boolean true, sinon false), on reste dans le logiciel
		while (!exit == true) {
			ihm.displayMenu(menu);
			choice = ihm.getChoice();// setChoix place le choix dans la valeur     //getTexte  //setTexte
			intChoice = Integer.parseInt(choice);
			switch (intChoice) {
				case 1:
					ihm.display("entrez le mot recherché : ");
					ihm.setTexte();
					methodemenu.motExact(load.loadFile(), ihm.getTexte());
			    break;
				case 2:
					ihm.display("entrez un début de mot : ");
					ihm.setTexte();
					// methodemenu.motCommence(load.loadFile(), ihm.getTexte());
				    break;
				case 3:
					ihm.display("entrez une fin de mot : ");
					ihm.setTexte();
				    // methodemenu.motTermine(load.loadFile(), ihm.getTexte());
				    break;
				case 4:
					ihm.display("entrez une partie de mot : ");
					ihm.setTexte();
				    // methodemenu.motContient(load.loadFile(), ihm.getTexte());
				    break;
				default:
					ihm.display ("Vous n'avez pas saisi de choix");
			}
		}
	}
}


