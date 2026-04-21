public class Zoo {
    public static void main(String[] args) {

        Animal tigre = new Mammifere("Tigre");
        Animal perroquet = new Oiseau("Perroquet");

        tigre.faireDuBruit();
        perroquet.faireDuBruit();

        // utiliser méthode spécifique
        Oiseau o = (Oiseau) perroquet;
        o.voler();
    }
}
