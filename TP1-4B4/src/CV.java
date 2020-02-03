
public class CV {

	private String nom;
	private String prenom;
	private String formation;
	private int annees_experience;
	private String[] competences;
	private String attentes;
	
	public CV (String nom, String prenom, String formation,
			int annees_experience, String[] competences, String attentes) {
		
		this.nom = nom;
		this.prenom = prenom;
		this.formation = prenom;
		this.annees_experience = annees_experience;
		this.competences = competences;
		this.attentes = attentes;
		
	}
	
	public static void main( String[] args ) {
		System.out.println( "Bienvenue chez Barette!" );
		
		
	}

}
