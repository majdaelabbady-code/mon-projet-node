package exercice12;

public class GestionTransport {
    public static void main(String[] args) {

        Vehicule v1 = new Voiture("Toyota", "Corolla", 2021, 4);
        Vehicule v2 = new Camion("Volvo", "FMX", 2019, 12.5);
        Vehicule v3 = new Moto("Yamaha", "MT-07", 2022, "Sport");

        v1.afficherDetails();
        v2.afficherDetails();
        v3.afficherDetails();
    }
}