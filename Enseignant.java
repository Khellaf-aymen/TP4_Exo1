

public class Enseignant extends Personne {
	
	int nbHeures;
	String module;
	
	public Enseignant(String nom, String prenom, int age, int nbHeure, String module) {
		super(nom, prenom, age);		
		this.nbHeures = nbHeure;
		this.module = module;
	}
	
	@Override
	public void afficher() {
		System.out.print("Nom = "+nom);
		System.out.print("    Prenom = "+prenom);
		System.out.print("    Age = "+age);		
		System.out.print("    Nombre d'heures = "+nbHeures);		
		System.out.println("    Module = "+module);		
		System.out.println("  ************  ");		
	}

	@Override
	void stocker() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'stocker'");
	}
	
}
