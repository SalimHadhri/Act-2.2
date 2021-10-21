import java.awt.List;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Compléter les imports
public class SautoLit {

   static void lecture(Scanner source) {
       while(source.hasNextLine()) {
    	   
           String s = source.nextLine();
           
           System.out.println(s);
       }
   }
   
   

   static public void main(String[] args) throws Exception {
    
		BufferedReader br = new BufferedReader(new FileReader("src/fichierAAfficher.txt"));	
		
		String line = br.readLine();
		
		ArrayList<String>  lignes= new ArrayList<String> () ;
		
		while (line != null) {
						

			 lignes.add(line) ;
			Scanner saisieUtilisateur= new Scanner(line) ;
			lecture(saisieUtilisateur);
			line = br.readLine();	
			
		}
	System.out.println("*******************************************************reverse************************");
	Collections.reverse(lignes);
	
	ArrayList<String>  lignesReversed= new ArrayList<String> () ;
	
	for (String ligne : lignes) {
		
		char[] reversedChars = new char[ligne.length()];		


		
		int i = ligne.length()-1 ;
		int j = 0 ;
		while (j< ligne.length()) {
			reversedChars[j] = ligne.charAt(i);
			j++ ;
			i-- ;
		}
		
		String wordreversed =String.copyValueOf(reversedChars) ;
		lignesReversed.add(wordreversed) ;
		
	}
	
	
	for (String ligne : lignesReversed) {
				
		System.out.println(ligne);
	}
	
	for (int i =0 ; i<lignesReversed.size(); i++) {
		File myObj = new File("src/monFichier_L"+i+".txt");
		myObj.createNewFile() ;
		FileWriter myWriter = new FileWriter("src/monFichier_L"+i+".txt");
		myWriter.write(lignesReversed.get(i) );
		myWriter.close();
		 
		
	}

   }
   
}
