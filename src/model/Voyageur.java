package model;

import java.util.List;

public class Voyageur extends Utilisateur {
    private String passeport;
    private String adresse;

    public Voyageur() {}

    public Voyageur(int id, String nom, String prenom, String login, String motDePasse,
                    String passeport, String adresse) {
        super(id, nom, prenom, login, motDePasse);
        this.passeport = passeport;
        this.adresse = adresse;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Voyageur: " + nom + " " + prenom + ", Passeport: " + passeport + ", Adresse: " + adresse);
    }

    public void reserverBillet(Vol vol, Siege siege) {
        // Implémentation à compléter
        System.out.println("Réservation effectuée pour le vol " + vol.getIdVol());
    }

    public void afficherVolsDisponibles(List<Vol> listeVols) {
        System.out.println("Vols disponibles:");
        for (Vol v : listeVols) {
            System.out.println("Vol n°" + v.getIdVol() + " de " + v.getAeroportDepart() + " à " + v.getAeroportArrivee());
        }
    }

    // Getters & Setters
    public String getPasseport() { return passeport; }
    public void setPasseport(String passeport) { this.passeport = passeport; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }
}
