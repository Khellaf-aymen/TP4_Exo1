import java.util.Arrays;

public class TpH {
	public static void main(String[] args) {  


		
		
		


		Enseignant[] tabe = new Enseignant[3] ;
		Etudiant[] tabetu =new Etudiant[3] ;
		
		tabe[0] = new Enseignant("tboun", "rayas", 29, 8);
		tabe[1] = new Enseignant("hadaf", "Rodriguez",20, 11);
		tabe[2] = new Enseignant("hadad", "DeBraun", 42, 11);
		tabetu[0] = new Etudiant("khellaf", "Aymen", 20, 65424);
		tabetu[1] = new Etudiant("Roberto", "Costa", 21, 35652);
		tabetu[2] = new Etudiant("bennacer", "Tarek", 24, 75421);
	
			
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
	
		
	
	


