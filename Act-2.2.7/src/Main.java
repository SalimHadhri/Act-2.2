import java.io.BufferedReader;
import java.io.File;
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
		   if (text1.size()< text2.size()) {  
			   int j=0 ;
			   for (int i = 0 ; i <(text1.size()*2);i=i+2) {
				   textMelange.add(i, text1.get(j));
				   textMelange.add(i+1, text2.get(j));	
				   j++ ;
			   }	   
		   }
		   else if ((text1.size()> text2.size()))
		   {
			   int z =0;
				   for (int k = 0 ; k <(text2.size()*2);k=k+2) {
					   textMelange.add(k, text1.get(z));
					   textMelange.add(k+1, text2.get(z));	
					   z++ ;
				   }

			   }
			   

		   ArrayList<String> ajoutTexte = new ArrayList<String> () ;
		   if (text1.size()< text2.size()) {
			   for (int l= text1.size() ; l<text2.size();l++) {
				   ajoutTexte.add(text2.get(l)) ;
			   }
		   }
		   else if (text1.size()> text2.size()) {
			   for (int e= text2.size() ; e<text1.size();e++) {
				   ajoutTexte.add(text1.get(e)) ;
			   }

		   }
		   textMelange.addAll(ajoutTexte) ;	
		return textMelange ;	   
		}
		   
		     
	   
	   public static void main(String[] args) throws IOException {
			
		   BufferedReader br = new BufferedReader(new FileReader("src/Texte1.txt"));			
		   String line = br.readLine();
		   ArrayList<String>  Text1= new ArrayList<String> () ;
		   while (line != null) {
			   Text1.add(line) ;
			   line = br.readLine();				
		   }
	
		   BufferedReader br1 = new BufferedReader(new FileReader("src/Texte2.txt"));			
		   String line1 = br1.readLine();	
		   ArrayList<String>  Text2= new ArrayList<String> () ;	
		   while (line1 != null) {
			   Text2.add(line1) ;
			   line1 = br1.readLine();		
		   }
		   ArrayList<String> textMelange = new ArrayList<String> () ; 
		   textMelange= melange(Text1,Text2) ;

		   for (int i =0 ; i<textMelange.size(); i++) {
			   System.out.println(textMelange.get(i));			 		
		   }							
		   FileWriter myWriter = new FileWriter("src/TexteMelange.txt");
		   File myObj = new File("src/TexteMelange.txt");
		   for (int i =0 ; i<textMelange.size(); i++) {
			   myWriter.write(textMelange.get(i) + "\n");
					 		
		   }
		   myWriter.close();
	}
}
