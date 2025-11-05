package model;

import java.util.List;

public class Avion {
    private int idAvion;
    private String compagnie;
    private int nbPlaces;
    private List<Siege> sieges; // Composition

    public Avion() {}

    public Avion(int idAvion, String compagnie, int nbPlaces, List<Siege> sieges) {
        this.idAvion = idAvion;
        this.compagnie = compagnie;
        this.nbPlaces = nbPlaces;
        this.sieges = sieges;
    }

    public int getIdAvion() { return idAvion; }
    public void setIdAvion(int idAvion) { this.idAvion = idAvion; }

    public String getCompagnie() { return compagnie; }
    public void setCompagnie(String compagnie) { this.compagnie = compagnie; }

    public int getNbPlaces() { return nbPlaces; }
    public void setNbPlaces(int nbPlaces) { this.nbPlaces = nbPlaces; }

    public List<Siege> getSieges() { return sieges; }
    public void setSieges(List<Siege> sieges) { this.sieges = sieges; }
}
