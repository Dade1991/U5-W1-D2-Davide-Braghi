package com.epicode.U5D1.entities;

public class Tavolo {
    private long tavoloId;
    private long copertiNumero;
    private StatoTavolo statoTavolo;

    public Tavolo(long tavoloId, long copertiNumero, StatoTavolo statoTavolo) {
        this.tavoloId = tavoloId;
        this.copertiNumero = copertiNumero;
        this.statoTavolo = statoTavolo;
    }

    public long getTavoloId() {
        return tavoloId;
    }

    public void setTavoloId(long tavoloId) {
        this.tavoloId = tavoloId;
    }

    public long getCopertiNumero() {
        return copertiNumero;
    }

    public void setCopertiNumero(long copertiNumero) {
        this.copertiNumero = copertiNumero;
    }

    public StatoTavolo getStatoTavolo() {
        return statoTavolo;
    }

    public void setStatoTavolo(StatoTavolo statoTavolo) {
        this.statoTavolo = statoTavolo;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "tavoloId=" + tavoloId +
                ", copertiNumero=" + copertiNumero +
                ", statoTavolo=" + statoTavolo +
                '}';
    }
}

