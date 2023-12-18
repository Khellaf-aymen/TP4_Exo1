import java.util.ArrayList;

public class Enseignant extends Personne implements Comparable{
	private static ArrayList<Enseignant> ens = new  ArrayList<Enseignant>()  ;

	int nbHeures;
	ArrayList<String> modules;
	
	public Enseignant(String nom, String prenom, int age, int nbHeure) {
		super(nom, prenom, age);		
		this.nbHeures = nbHeure;
		this.modules =new ArrayList<String>();
		ens.add(this); 

	}
	
	@Override
	public String toString() {

		return ("Nom = "+nom) +("\nPrenom = "+prenom)+ ("\nAge = "+age) + ("Nombre d'heures = "+nbHeures)+("Module = ");	
	}

	@Override
	void stocker() 	{

	}
	void affecterModules(String module){
		modules.add(module);
	}


	@Override
	public int compareTo(Object o) {
		return nom.compareTo(((Enseignant)o).nom);
	}
	
}
