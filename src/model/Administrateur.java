package model;

import java.util.List;
import enums.EtatBillet;

public class Administrateur extends Utilisateur {

    public Administrateur() {}

    public Administrateur(int id, String nom, String prenom, String login, String motDePasse) {
        super(id, nom, prenom, login, motDePasse);
    }

    // Constructeur par recopie
    public Administrateur(Administrateur autre) {
        super(autre);
    }

    @Override
    public void afficherInfos() {
        System.out.println("Administrateur: " + nom + " " + prenom);
    }

    /** Affecter un siège à un voyageur pour un vol donné */
    public boolean affectationSiege(Voyageur v, Vol vol, String typeSiege) {
        for (Siege s : vol.getAvion().getSieges()) {
            if (s instanceof SiegeReserve sr && !sr.isReserve() &&
                sr.getTypeSiege().toString().equalsIgnoreCase(typeSiege)) {
                sr.setReserve(true);
                System.out.println("Siège " + typeSiege + " réservé pour " + v.getNom());
                return true;
            }
        }
        System.out.println("Aucun siège disponible pour le type " + typeSiege);
        return false;
    }

    /** Gestion des voyageurs */
    public void ajouterVoyageur(Voyageur v, List<Voyageur> listeVoyageurs) {
        listeVoyageurs.add(v);
        System.out.println("Voyageur ajouté: " + v.getNom());
    }

    public void supprimerVoyageur(Voyageur v, List<Voyageur> listeVoyageurs) {
        if (listeVoyageurs.remove(v)) {
            System.out.println("Voyageur supprimé: " + v.getNom());
        } else {
            System.out.println("Voyageur introuvable: " + v.getNom());
        }
    }

    public void modifierVoyageur(Voyageur v, String nouveauNom, String nouveauPrenom) {
        v.setNom(nouveauNom);
        v.setPrenom(nouveauPrenom);
        System.out.println("Voyageur modifié: " + v.getNom() + " " + v.getPrenom());
    }

    public void afficherVoyageurs(List<Voyageur> listeVoyageurs) {
        System.out.println("Liste des voyageurs:");
        for (Voyageur v : listeVoyageurs) {
            v.afficherInfos();
        }
    }

    /** Gestion des avions */
    public void ajouterAvion(Avion a, List<Avion> listeAvions) {
        listeAvions.add(a);
        System.out.println("Avion ajouté: " + a.getCompagnie() + " (ID " + a.getIdAvion() + ")");
    }

    public void supprimerAvion(Avion a, List<Avion> listeAvions) {
        if (listeAvions.remove(a)) {
            System.out.println("Avion supprimé: " + a.getCompagnie() + " (ID " + a.getIdAvion() + ")");
        } else {
            System.out.println("Avion introuvable: " + a.getCompagnie());
        }
    }

    /** Gestion des vols */
    public void ajouterVol(Vol v, List<Vol> listeVols) {
        listeVols.add(v);
        System.out.println("Vol ajouté: " + v.getIdVol() + " de " + v.getAeroportDepart() + " à " + v.getAeroportArrivee());
    }

    public void supprimerVol(Vol v, List<Vol> listeVols) {
        if (listeVols.remove(v)) {
            System.out.println("Vol supprimé: " + v.getIdVol());
        } else {
            System.out.println("Vol introuvable: " + v.getIdVol());
        }
    }

    /** Gestion des billets */
    public void validerBillet(Billet b) {
        b.setEtat(EtatBillet.CONFIRME);
        System.out.println("Billet validé: ID " + b.getIdBillet() + " pour " + b.getVoyageur().getNom());
    }

    public void afficherBillets(List<Billet> listeBillets) {
        System.out.println("Liste des billets:");
        for (Billet b : listeBillets) {
            System.out.println("Billet ID " + b.getIdBillet() + ", Voyageur: " +
                               b.getVoyageur().getNom() + ", Vol: " + b.getVol().getIdVol() +
                               ", État: " + b.getEtat());
        }
    }
}
