import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MaximumWithoutExceptions {

	
	public static void main (String args[]) {
		
		
		try {	
			BufferedReader br = new BufferedReader(new FileReader("src/Data.txt"));	
			// could generate FileNotFoundException (checked)
			int max = -1;
			String line = br.readLine();
			// peut générer IOException
			while (line != null) {
				int n = Integer.parseInt(line);
				// peut générer NumberFormatException
				if (n > max) max = n;
				line = br.readLine();
				// peut générer IOException
			}
			System.out.println("Maximum = " + max);
		}
		catch(FileNotFoundException x ) { 
			//throw new FileNotFoundException(x.getMessage()) ;
			System.out.println(x.getMessage());
			//System.out.println(x.getMessage()); 
		}
		catch(IOException y) {	
			System.out.println(y.getMessage()); 
		}		
		catch (NumberFormatException z) {
			System.out.println(z.getMessage()); 
		}
	}
		
	
							
}
