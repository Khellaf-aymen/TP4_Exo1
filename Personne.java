

public abstract class Personne {
	
	String nom, prenom;
	int age;
	static int nbr_personne;  

	public Personne(String nom, String prenom, int age) {  
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		nbr_personne++;
	}


	abstract void stocker();
	public void afficher() {
		System.out.print("Nom = "+nom);
		System.out.print("    Prenom = "+prenom);
		System.out.println("    Age = "+age);		
		
	}

	public static void affich_nbr_personnes() {
		System.out.println("Nombres de personnes crees: "+nbr_personne);
	}
}
