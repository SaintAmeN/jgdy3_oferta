package com.jgdy3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfertaSprzedazy {
    private String nazwaProduktu;
    private double cena;
}
