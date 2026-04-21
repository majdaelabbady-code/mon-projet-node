class Oiseau extends Animal {
    public Oiseau(String nom) {
        super(nom);
    }

    public void faireDuBruit() {
        System.out.println(getNom() + " chante.");
    }

    public void voler() {
        System.out.println("L'oiseau vole.");
    }
}