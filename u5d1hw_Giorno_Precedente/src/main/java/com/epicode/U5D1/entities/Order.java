package com.epicode.U5D1.entities;

import java.time.LocalTime;
import java.util.List;

public class Order {
    private Tavolo tavolo;
    private List<Menu> elementiOrdinati;
    private StatoOrdine statoOrdine;
    private long copertiNumero;
    private LocalTime oraAcquisizione;
    private double importoTotale;

    public Order(Tavolo tavolo, List<Menu> elementiOrdinati, StatoOrdine statoOrdine, long copertiNumero, LocalTime oraAcquisizione, double importoTotale) {
        this.tavolo = tavolo;
        this.elementiOrdinati = elementiOrdinati;
        this.statoOrdine = statoOrdine;
        this.copertiNumero = copertiNumero;
        this.oraAcquisizione = oraAcquisizione;
        this.importoTotale = importoTotale;
    }


}

