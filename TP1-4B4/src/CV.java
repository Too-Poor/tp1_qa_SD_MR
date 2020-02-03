
public class CV {

	private String nom;
	private String prenom;
	private String formation;
	private int anneesExperience;
	private String[] competences;
	private String attentes;
	
	public CV (String nom, String prenom, String formation,
			int anneesExperience, String[] competences, String attentes) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.formation = prenom;
		this.anneesExperience = anneesExperience;
		this.competences = competences;
		this.attentes = attentes;
		
	}
	
	public void affiche() {
		String listeCompetences = null;
		
		for ( int i = 0; i < this.competences.length - 1; i++ ) {
			listeCompetences += this.competences[i] + ", ";
		}
		listeCompetences += this.competences[this.competences.length - 1];
		
		System.out.println( "\nVoici les informations de " + this.prenom + " " + this.nom + ":" );
		
		System.out.println( "\nNom : " + this.nom);
		System.out.println( "\nPrenom : " + this.prenom);
		System.out.println( "\nFormation : " + this.formation );
		System.out.println( "\nAnnées d'expérience : " + this.anneesExperience );
		System.out.println( "\nListe des compétences : " + listeCompetences );
		System.out.println( "Attentes vis à vis le cours 4B4 : " + this.attentes );
	}
	
	public static void main( String[] args ) {
		System.out.println( "Bienvenue chez Barette!" );
		
		
	}

}
