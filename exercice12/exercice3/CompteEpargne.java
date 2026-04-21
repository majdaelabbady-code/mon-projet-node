package exercice12.exercice3;

public class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    public CompteEpargne(String titulaire, double solde, double tauxInteret) {
        super(titulaire, solde);
        this.tauxInteret = tauxInteret;
    }

    public void ajouterInteret() {
        solde += solde * tauxInteret;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Compte Epargne: " + titulaire + " | Solde: " + solde);
    }
}