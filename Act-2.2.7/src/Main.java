import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;




public class Main {

	
	   static void lecture(Scanner source) {
	       while(source.hasNextLine()) {
	    	   
	           String s = source.nextLine();
	           
	           System.out.println(s);
	       }
	   }
	   
	   public static ArrayList<String> melange(ArrayList<String> text1 , ArrayList<String> text2){
		   
		   ArrayList<String> textMelange = new ArrayList<String> () ; 
		   
		   ArrayList<String> textMax = new ArrayList<String> () ;
		   
		   int plusGrans = 0 ;
		   int minLength ;
		   
		   
		   if (text1.size() < text2.size()) {

			   minLength = text1.size() ; 
			   textMax=text2 ;
			   plusGrans=2 ;
			   
		   }
		   else if  (text1.size() > text2.size()) {
			   
			   minLength=text2.size() ;   
			   textMax=text1 ;
			   plusGrans=1 ;
		   }
		   else {
			   minLength=text1.size() ;
			   textMax=text1 ;
		   }
		   
		   int i = 0 ;
		   
		   while(i<minLength ) {
			   
			   textMelange.add(i, text1.get(i));
			   textMelange.add(i+1, text2.get(i));	
			   i++ ;
			   
		   }
		  
		   
		   if(text1.size()!=text2.size() && plusGrans==1) {
			   
			   for (int x = minLength; x < text1.size()  ; x++) {
				   
				   textMelange.add(x, text1.get(x));		   			   
			   }
		   }else if (text1.size()!=text2.size() && plusGrans==2) {
			   		for (int y = minLength; y < text2.size()  ; y++) {
				   
			   			textMelange.add(y, text2.get(y));		   			   
			   		}	
		   }
		   
		 return textMelange ;  
		   
	   }
	   
	public static void main(String[] args) throws IOException {
		
		
	
		
		BufferedReader br = new BufferedReader(new FileReader("src/Texte1.txt"));			
		String line = br.readLine();
		
		
		ArrayList<String>  Text1= new ArrayList<String> () ;
		
		while (line != null) {
			Text1.add(line) ;
			//Scanner saisieUtilisateur= new Scanner(line) ;
			//lecture(saisieUtilisateur);
			line = br.readLine();	
			
		}
		

		
		BufferedReader br1 = new BufferedReader(new FileReader("src/Texte2.txt"));			
		String line1 = br1.readLine();
		
		
		ArrayList<String>  Text2= new ArrayList<String> () ;
		
		while (line1 != null) {
			Text2.add(line1) ;
			//Scanner saisieUtilisateur1= new Scanner(line1) ;
			//lecture(saisieUtilisateur1);
			line1 = br1.readLine();		
		}



		ArrayList<String> textMelange = new ArrayList<String> () ; 
		
		textMelange= melange(Text1,Text2) ;
											
		FileWriter myWriter = new FileWriter("src/TexteMelange.txt");
		for (int i =0 ; i<textMelange.size(); i++) {
			//File myObj = new File("src/TexteMelange.txt");

			myWriter.write(textMelange.get(i) );
			
			 		
		}
		myWriter.close();
	

	}

}
