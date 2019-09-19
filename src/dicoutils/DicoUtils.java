package dicoutils;

public class DicoUtils {
	
	public static void main(String[] args){
		
	}
	/* --------------------------COMMENTAIRE DE HANFIA----------------------
	 * -constructeur par défaut 
	 * DicoIhm.motexacte = new DicoIm ();
	 * DicoIhm.motcommence = new DicoIm ();
	 * DicoIhm.motfinal =
	 * system.out.println(motexacte.get; motcommence.get;)
	 --------------------------------------------------------------------------*/
	
	
	/*--------------------------COMMENTAIRE UMBRELLO----------------------
	
	exit = false;/                                      / boolean exit = false ;
	nom variable load = new DicoLoader();               /    
	nom variable ihm = new DicoIhm();                   /     DicoIhm ihm = new DicoIhm();   
	ihm.display ("bienvenue...")                        /
	dico = loader.loadFile("....txt")
	
	- Boucle While
			tant qu'on ne quitte pas (!exit boolean true, sinon false), on reste dans le logiciel
			// affichage du menu 1, 2, 3, 4
			--> ihm.displayMenu();
			//on nomme choice le choix de l'utilisateur dans la méthode instanciée
        	  
			choice = ihm.recupescan();
			
			- Switch
				si case "1" 
					motExact();
					ihm.display("ok")
					break
				si case "2"
					motCommence()
					ihm.display("ok")
					break
				si case "3" 
					motTermine()
					ihm.display("ok")
					break
				si case "4"
					motContient()
					ihm.display("ok")
					break
				sinon case default : ihm.display ("erreur ")
			}
		}
	
	1 - methodes motExact
			- if ("recupeScan" == a une donnée dans le tableau){
				affiche (system OUT) le mot exact (compareTo())
				}else{
					sinon "ce mot n'existe pas dans le dico"
				}
	
	2 - methodes motCommence
			récupérer la chaine de mot "recupeScan", (.length) et la comparer au tableau (substring)
		-
	3 - methodes motTermine
			- récupérer la chaine de mot "recupeScan", et comparer la fin des mots dans le tableau (reverse.substring)
		-
	4 - methodes motContient
			- récupérer la chaine de mot "recupeScan" et la comparer à l'intérieur des mots du tableau
	
	-  methodes bonChoix
	
	-  methodes autreChoix
	
	-  methodes retourMenu
	
	-  methodes quitter
	

	 --------------------------------------------------------------------------*/
	}


