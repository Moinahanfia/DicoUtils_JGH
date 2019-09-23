package dicoutils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DicoLoader {
	
	public String[] loadFile() {
		File f = new File("dictionnaire.txt");//https://trello-attachments.s3.amazonaws.com/5d7f44f1fdb7fb0a4cf26ca2/5d809d50ebeef841636ddada/3b08ddba61832a31e714b45b49bf5ed4/dictionnaire.txt
		FileReader fr = null;
	    try {
	    	fr = new FileReader(f);
		    BufferedReader br = new BufferedReader(fr);
		    String line;
		    while((line = br.readLine()) != null) {
		    	System.out.println(line);
		    }
		    br.close();
	    } catch (Exception e) {
	    	System.out.println("");
	    }
	    return "";
	}
}/*catch (Exception e) {
        System.out.println("Something went wrong.");
      }*/
	
	/*--------------------------COMMENTAIRE UMBRELLO----------------------
	Méthodes :
	- loadFile 
		- créer tableau dico

	- comparDico
		-  on compare le mot complet au dictionnaire
    ---------------------------------------------------------------------*/
	
	
	/* --------------------------COMMENTAIRE DE HANFIA----------------------
	 method display
	 * 
	 * method getter
	 * public int get list (){return;}
	 
	 method setter
	 * if () si le mec il saisie n'importe quoi  alors 
	 * else (on va afficher erreur)
	 * 
	
	 --------------------------------------------------------------------------*/
	

