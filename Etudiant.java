import java.util.ArrayList;
import java.util.Scanner;
public class Etudiant extends Personne implements Comparable {
	private static ArrayList<Etudiant> etds = new  ArrayList<Etudiant>()  ;



	Scanner in =new Scanner(System.in);


	int matricule;
	//int [] notes = new int[8];
	ArrayList<Integer> notes=new ArrayList<Integer>();

	
	public Etudiant(String nom, String prenom, int age, int matricule) {
		super(nom, prenom, age);
		this.matricule = matricule;
		etds.add(this); 

	}

void  RemplirNotes() {
	for (int i = 0 ; i<5 ; i++){
System.out.println("enter "+i+ "mark :");
notes.add(in.nextInt());
}
	
}

	public float calculMoyenne() {
		float total=0;
		for (int i=0; i<8; i++) {
			total = total + notes.get(i);
		}
		return total/8;
	}
	
	
	@Override
	void stocker() {
		
	}

	double CalculMoyenne(){
		double moy = 0 ;
		for(int i = 0 ; i<notes.size();i++)
		{
			moy = moy +(notes.get(i)/5);
		}
		return moy ; 
	}

	@Override
	public int compareTo(Object o) {
		if (this.age ==((Etudiant)o).age) {return 0 ;}
		else if (this.age >((Etudiant)o).age){return 1;}
		else return -1 ;  
	}
	@Override
	public String toString() {
		
		return ("Nom = "+nom) +("\nPrenom = "+prenom)+ ("\nAge = "+age);
	}
}
		
	
