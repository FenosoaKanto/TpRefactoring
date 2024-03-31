package iut.bad;

public class Humain {
    protected String nom;
    protected String prenom;
    protected int age;

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void details() {
        System.out.println("Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age);
    }
    
    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Âge: " + age;
    }

    public void manger() {
        System.out.println("Je mange.");
    }

    public void boire() {
        System.out.println("Je bois.");
    }
    
    public void ami(Humain ami, int dureeAmitie) {
        System.out.println(" ca fait deja " + dureeAmitie + " jours qu'on est amis.");
    }
}