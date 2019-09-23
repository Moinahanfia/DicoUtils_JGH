package dicoutils;
//import java.util.List;
import java.util.Scanner;

public class DicoIhm {
	
	//method displayMenu
	public String[] displayMenu(String valeur) {
		System.out.println("1 -- Rechercher un mot Exact");
		System.out.println("2 -- Rechercher les mots commençant par :");
		System.out.println(valeur);
		System.out.println(valeur);
		System.out.println(valeur);
		System.out.println(valeur);
	}= {"###########################################",
			 ",
			 ,
			 "3 -- Rechercher les mots terminant par :",
			 "4 -- Rechercher les mots contenant :",
			 "###########################################"};
	
	//method display
	public void display(String valeur) {
		System.out.println(valeur);
	}
	// code source : Hanfia !
	// variable d'instance prive
	private String choix;
	private String texte;
	Scanner clavier= new Scanner(System.in);//j'ai créer un objet de la classe scanner
	
	public DicoIhm(){
	};
	    
	// le constructeur d'initialisation
	public DicoIhm(String pChoix, String pTexte){
		this.choix = pChoix;
		this.texte = pTexte;
	};
	     
	// getteurs pour choix
	public String getChoix() {
		return choix;
	}
	
	// setteurs pour choix
	/*public String getChoice(){
		String pChoix = clavier.nextInt();
		if(pChoix >=0 || pChoix <=5){
			this.choix=pChoix;
			return pChoix;
		}else{
			System.out.println("choix impossible");
			return "faux";
		}
	}*/
	
	public String getChoice(){
		String pChoix = clavier.nextLine();			
		return pChoix;		
	}
	
	public String getTexte() {
		return choix;
	}
	public void setTexte(){
		String pTexte = clavier.nextLine();
	    
		if(pTexte != null ){
			this.texte=pTexte;
		}else {
			System.out.println("la valeur choisis n'est pas bonne");
		}      
	}
}
	
	
	/* --------------------------COMMENTAIRE DE HANFIA----------------------
	 - method list 
	 * 		variable d'instance
	 * 		-private String List
	 * 
	 * 		constructeur par defaut
	 * 		public static void DicoIhm (String[]args){
	 * 							list = 0;		}
	 * 
	 * 		constructeur d'initialisation
	 * 		public DicoIhm (){}
	 *
	 - method Bienvenue
	 * public static void main (String [] args){
	 * System.out.println("Bienvenue");	
	 --------------------------------------------------------------------------*/


