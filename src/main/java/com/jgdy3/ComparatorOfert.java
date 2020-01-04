package com.jgdy3;

import java.util.Comparator;

public class ComparatorOfert implements Comparator<OfertaSprzedazy> {
    private boolean malejąco = true;

    public ComparatorOfert(boolean malejąco) {
        this.malejąco = malejąco;
    }

    // odwracamy sortowanie jeśli !malejąco
    public int compare(OfertaSprzedazy ofertaSprzedazy, OfertaSprzedazy t1) {
        if (!malejąco) {
            return Double.compare(ofertaSprzedazy.getCena(), t1.getCena());
        } else {
            return Double.compare(t1.getCena(), ofertaSprzedazy.getCena());
        }
    }
}
