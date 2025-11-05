package model;

import enums.TypeSiege;

public class SiegeReserve extends Siege {
    private boolean estReserve;

    public SiegeReserve() {}

    public SiegeReserve(int idSiege, TypeSiege type, boolean estReserve) {
        super(idSiege, type);
        this.estReserve = estReserve;
    }

    public boolean isReserve() { return estReserve; }
    public void setReserve(boolean estReserve) { this.estReserve = estReserve; }
}

