package model;

import java.time.LocalDateTime;
import enums.EtatBillet;

public class Billet {
    private int idBillet;
    private LocalDateTime dateReservation;
    private LocalDateTime dateVoyage;
    private LocalDateTime dateArrivee;
    private EtatBillet etat;
    private Voyageur voyageur;
    private Vol vol;
    private SiegeReserve siegeReserve;

    // Constructeurs, getters et setters
    public Billet() {}

    public Billet(int idBillet, LocalDateTime dateReservation, LocalDateTime dateVoyage,
                  LocalDateTime dateArrivee, EtatBillet etat,
                  Voyageur voyageur, Vol vol, SiegeReserve siegeReserve) {
        this.idBillet = idBillet;
        this.dateReservation = dateReservation;
        this.dateVoyage = dateVoyage;
        this.dateArrivee = dateArrivee;
        this.etat = etat;
        this.voyageur = voyageur;
        this.vol = vol;
        this.siegeReserve = siegeReserve;
    }

    public int getIdBillet() { return idBillet; }
    public void setIdBillet(int idBillet) { this.idBillet = idBillet; }

    public LocalDateTime getDateReservation() { return dateReservation; }
    public void setDateReservation(LocalDateTime dateReservation) { this.dateReservation = dateReservation; }

    public LocalDateTime getDateVoyage() { return dateVoyage; }
    public void setDateVoyage(LocalDateTime dateVoyage) { this.dateVoyage = dateVoyage; }

    public LocalDateTime getDateArrivee() { return dateArrivee; }
    public void setDateArrivee(LocalDateTime dateArrivee) { this.dateArrivee = dateArrivee; }

    public EtatBillet getEtat() { return etat; }
    public void setEtat(EtatBillet etat) { this.etat = etat; }

    public Voyageur getVoyageur() { return voyageur; }
    public void setVoyageur(Voyageur voyageur) { this.voyageur = voyageur; }

    public Vol getVol() { return vol; }
    public void setVol(Vol vol) { this.vol = vol; }

    public SiegeReserve getSiegeReserve() { return siegeReserve; }
    public void setSiegeReserve(SiegeReserve siegeReserve) { this.siegeReserve = siegeReserve; }
}
