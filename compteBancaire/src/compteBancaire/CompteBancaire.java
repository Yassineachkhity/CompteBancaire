package compteBancaire;

public class CompteBancaire {
	
	private double solde;
	
	public CompteBancaire() {
		this(0);
	}
	
	public CompteBancaire(double solde) {
		this.solde = solde;
	}
	
	public double getBalance() {
		return this.solde;
	}
	
	public void deposer(double montant) {
		this.solde += montant;
	}
	
	public void retirer(double montant) {
		this.solde -= montant;
	}
	
	public void ajouterInteret(double taux) {
		this.solde *= (1 + taux);
	}
	
	public static void main(String[] args) {
		CompteBancaire compte1 = new CompteBancaire();
		CompteBancaire compte2 = new CompteBancaire(5000);
		compte1.deposer(1000);
		compte2.retirer(2000);
		compte1.ajouterInteret(0.4);
		
		System.out.println(compte1.getBalance());
		System.out.println(compte2.getBalance());
	}
	
	
	
}
