package exercice12.exercice3;

public abstract class CompteBancaire {
    protected String titulaire;
    protected double solde;

    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public void deposer(double montant) {
        solde += montant;
    }

    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant !");
        }
    }

    public abstract void afficherDetails();
}