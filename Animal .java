abstract class Animal { 
    private String nom; 
    public Animal(String nom) { 
        this.nom = nom; 
    } 
    public String getNom() { 
        return nom; 
    } 
    // Méthode abstraite à implémenter dans les sous-classes 
    public abstract void faireDuBruit(); 
} 