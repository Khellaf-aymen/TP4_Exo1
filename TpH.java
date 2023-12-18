import java.util.Arrays;

public class TpH {
	public static void main(String[] args) {  


		
		
		


		Enseignant[] tabe = new Enseignant[3] ;
		Etudiant[] tabetu =new Etudiant[3] ;
		
		tabe[0] = new Enseignant("Elio", "Goettelmann", 29, 8);
		tabe[1] = new Enseignant("Aymen", "Braun", 42, 11);
		tabe[2] = new Enseignant("Richard", "Braun", 42, 11);
		tabetu[0] = new Etudiant("Pedri", "Rodriguez", 31, 65424);
		tabetu[1] = new Etudiant("Sergio", "Roberto", 25, 35652);
		tabetu[2] = new Etudiant("Claude", "Godart", 27, 75421);
	
			
			Arrays.sort(tabetu);
			Arrays.sort(tabe);

				for(int i=0; i<3; i++) {
			
				System.out.println(tabe[i]);
			}

			for(int i=0; i<3; i++) {
			
				System.out.println(tabetu[i]);
			}
				
			}
			
		}
	
		
	
	


