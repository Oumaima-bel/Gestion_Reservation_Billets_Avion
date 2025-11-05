package model;

import java.time.LocalDateTime;
import java.util.List;

public class Vol {
    private int idVol;
    private LocalDateTime heureDepart;
    private LocalDateTime heureArrivee;
    private double duree;
    private String aeroportDepart;
    private String aeroportArrivee;
    private Avion avion; // Association
    private List<Billet> billets; // Association

    // Constructeurs, getters et setters
    public Vol() {}
    
    public Vol(int idVol, LocalDateTime heureDepart, LocalDateTime heureArrivee, double duree,
               String aeroportDepart, String aeroportArrivee, Avion avion) {
        this.idVol = idVol;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.duree = duree;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
        this.avion = avion;
    }

    public int getIdVol() { return idVol; }
    public void setIdVol(int idVol) { this.idVol = idVol; }

    public LocalDateTime getHeureDepart() { return heureDepart; }
    public void setHeureDepart(LocalDateTime heureDepart) { this.heureDepart = heureDepart; }

    public LocalDateTime getHeureArrivee() { return heureArrivee; }
    public void setHeureArrivee(LocalDateTime heureArrivee) { this.heureArrivee = heureArrivee; }

    public double getDuree() { return duree; }
    public void setDuree(double duree) { this.duree = duree; }

    public String getAeroportDepart() { return aeroportDepart; }
    public void setAeroportDepart(String aeroportDepart) { this.aeroportDepart = aeroportDepart; }

    public String getAeroportArrivee() { return aeroportArrivee; }
    public void setAeroportArrivee(String aeroportArrivee) { this.aeroportArrivee = aeroportArrivee; }

    public Avion getAvion() { return avion; }
    public void setAvion(Avion avion) { this.avion = avion; }

    public List<Billet> getBillets() { return billets; }
    public void setBillets(List<Billet> billets) { this.billets = billets; }
}
