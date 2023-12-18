

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
	/*@Override
	public String toString() {
	return ("Nom = "+nom) +("\nPrenom = "+prenom)+ ("\nAge = "+age);
		
	}*/
	
		 
	
    
}                
