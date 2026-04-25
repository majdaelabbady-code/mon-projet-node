class Mammifere extends Animal {
    public Mammifere(String nom) {
        super(nom);
    }

    public void faireDuBruit() {
        System.out.println(getNom() + " grogne.");
    }
}