



public class TpH {
	public static void main(String[] arguments) {  //args est un tableau de cha�nes de caract�res


		
		
		


		Personne[] tab = new Personne[5];
		
		int [] tab_notes1 = {13, 14, 17, 8, 10, 9, 11, 14};
		int [] tab_notes2 = {11, 9, 8, 13, 19, 5, 11, 12};
		int [] tab_notes3 = {12, 8, 16, 16, 11, 6, 6, 10};
		
		tab[0] = new Enseignant("Elio", "Goettelmann", 29, 8, "Algorithme");
		tab[1] = new Enseignant("Richard", "Braun", 42, 11, "BPMN");
		tab[2] = new Etudiant("Pedri", "Rodriguez", 31, 65424, tab_notes1);
		tab[3] = new Etudiant("Sergio", "Roberto", 25, 35652, tab_notes2);
		tab[4] = new Etudiant("Claude", "Godart", 27, 75421, tab_notes3);
		for(int i=0; i<tab.length; i++) {
			if (tab[i] instanceof Enseignant) {
				System.out.println("Enseignant");
			}
			else {
				System.out.println("Etudiant");
			}
			tab[i].afficher(false);
		}
	
		Personne.affich_nbr_personnes();
	
	}

}
