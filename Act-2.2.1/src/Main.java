import java.util.Scanner;

import exceptions.intSaisieException;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Saisir un nombre entre 10 et 30 inclus: ");
		Scanner saisieUtilisateur = new Scanner(System.in);
		int saisie = saisieUtilisateur.nextInt();
		saisieInt(saisie) ;

	}
	
	public static void saisieInt(int x) throws intSaisieException {
		
		if ( x<10 || x>30) {
			 throw new intSaisieException("The value is not in the allowed interval");
        }
		else {
			System.out.println("Saisie réussie!!");
		}
	}
		
}


