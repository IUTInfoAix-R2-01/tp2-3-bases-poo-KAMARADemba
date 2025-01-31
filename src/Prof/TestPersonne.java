package Prof;

public class TestPersonne {
	public static void main(String[] args) {
		Personne p1 = new Personne ("Laurence", "Ago");
		Personne p2 = new Personne ("Ago");
		System.out.println(p1.getPrenom());
		System.out.println(p1.getNom());
		System.out.println(p2.getPrenom());
		System.out.println(p1.toString());
		System.out.println(p1.toString());
	}
}