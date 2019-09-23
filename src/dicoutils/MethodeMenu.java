package dicoutils;

public class MethodeMenu {
	
	private String motexact;
	private String motCommence;
	private String motTermine;
	private String motContient;

	public MethodeMenu() {
	}
	public MethodeMenu(String motexact, String motCommence, String motTermine, String motContient) {
		super();
		this.motexact = motexact;
		this.motCommence = motCommence;
		this.motTermine = motTermine;
		this.motContient = motContient;
	}
	// ------------------------------------motExact
	public String getMotexact() {
		return motexact;
	}
	public void setMotexact(String motexact) {
		this.motexact = motexact;
	}
	public String motExact(String[] tableau, String motRecherche) {
		 for (int i = 0; i < tableau.length; i++) {
			boolean  comparaison = tableau[i].equals(motRecherche); // renvoie 0 si la chaine est égale
	        if (comparaison) {
	        	return " un mot trouvé";
	        	//return recupscan; 	
	        } return "aucun mot trouvé";
	        /*else {
	        	return "ce mot n'existe pas dans le dictionnaire";
	        }*/	  
		 }
		 return "";
	}
	// ------------------------------------motCommence
	/*String s1="javatpoint";  
	System.out.println(s1.substring(0,3));//returns java  */
		public String getMotCommence() {
			return motCommence;
		}
		public void setMotCommence(String motCommence) {
			this.motCommence = motCommence;
		}
		public String motCommence(String[] tableau, String motRecherche) {
			int longueur = motRecherche.length();
			for (int i = 0; i < tableau.length; i++) {
				String comparaison = tableau[i].substring(0,longueur);
				/*if () {
					return "voici la liste";
				}*/
				/*else {
	        		return "ce mot n'existe pas dans le dictionnaire";
	        	}*/	
			}
			/*for (int i = 0; i < tableau.length; i++) {
				String  comparaison = tableau[i].equals(motRecherche); // substring
		        if (comparaison) {
		        	return " un mot trouvé";	
		        } return "aucun mot trouvé";*/
		        /*else {
		        	return "ce mot n'existe pas dans le dictionnaire";
		        }*/	  
			// }
			 return "";
		}
		// ------------------------------------motTermine
		/*String s1="javatpoint";  
		System.out.println(s1.substring(2));//returns vatpoint  */
		public String getMotTermine() {
			return motTermine;
		}
		public void setMotTermine(String motTermine) {
			this.motTermine = motTermine;
		}
		public String motTermine(String[] tableau, String motRecherche) {
			
		}
		
		// ------------------------------------motContient
		/*String s1="javatpoint";  
		System.out.println(s1.substring(2,4));//returns va  */
		public String getMotContient() {
			return motContient;
		}
		public void setMotContient(String motContient) {
			this.motContient = motContient;
		}
		public String motContient(String[] tableau, String motRecherche) {
			
		}
}	
	/*--------------------------COMMENTAIRE UMBRELLO----------------------
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

