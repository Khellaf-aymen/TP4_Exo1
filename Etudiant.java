import java.util.ArrayList;

public class Etudiant extends Personne {
	int matricule;
	//int [] notes = new int[8];
	ArrayList<Integer> notes=new ArrayList<Integer>();
	float moyenne;
	
	public Etudiant(String nom, String prenom, int age, int matricule, ArrayList notes) {
		super(nom, prenom, age);
		this.matricule = matricule;
		this.notes = notes;
		moyenne = calculMoyenne();
	}
	
	public float calculMoyenne() {
		float total=0;
		for (int i=0; i<8; i++) {
			total = total + notes.get(i);
		}
		return total/8;
	}
	
	@Override
	public void afficher() {
		System.out.print("Nom = "+nom);
		System.out.print("    Prenom = "+prenom);
		System.out.print("    Age = "+age);		// On peut utiliser super.afficher() pour le nom, pr�nom et age
		System.out.print("    Matricule = "+matricule);
		System.out.print("    Notes: ");
		for (int i=0; i<notes.size(); i++) {
			System.out.print(notes.get(i)+" ");
		}
		System.out.println("    Moyenne = "+ moyenne);
		System.out.println("  ************  ");		
	}

	@Override
	void stocker() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'stocker'");
	}
}
		
	
