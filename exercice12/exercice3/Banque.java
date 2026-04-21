package exercice12.exercice3;

public class Banque {
    public static void main(String[] args) {

        CompteBancaire c1 = new CompteCourant("Ali", 1000, 500);
        CompteBancaire c2 = new CompteEpargne("Sara", 2000, 0.05);

        c1.retirer(1200);
        c2.deposer(500);

        ((CompteEpargne)c2).ajouterInteret();

        c1.afficherDetails();
        c2.afficherDetails();
    }
}