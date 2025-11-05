package model;

import enums.TypeSiege;

public class Siege {
    protected int idSiege;
    protected TypeSiege type;

    public Siege() {}

    public Siege(int idSiege, TypeSiege type) {
        this.idSiege = idSiege;
        this.type = type;
    }

    public int getIdSiege() { return idSiege; }
    public void setIdSiege(int idSiege) { this.idSiege = idSiege; }

    public TypeSiege getTypeSiege() { return type; }
    public void setTypeSiege(TypeSiege type) { this.type = type; }
}

