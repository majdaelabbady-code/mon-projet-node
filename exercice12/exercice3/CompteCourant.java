package exercice12.exercice3;

public class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String titulaire, double solde, double decouvertAutorise) {
        super(titulaire, solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) {
        if (solde + decouvertAutorise >= montant) {
            solde -= montant;
        } else {
            System.out.println("Dépassement du découvert !");
        }
    }

    @Override
    public void afficherDetails() {
        System.out.println("Compte Courant: " + titulaire + " | Solde: " + solde);
    }
}