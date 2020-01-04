package com.jgdy3;

import jdk.nashorn.internal.runtime.JSONListAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // logika parsera

        Scanner scanner = new Scanner(System.in);

        List<OfertaSprzedazy> oferty = new ArrayList<>();
        boolean isWorking = true;
        while (isWorking) {
            String komenda = scanner.nextLine();

            if (komenda.equals("quit")) {
                isWorking = false;
            } else if (komenda.startsWith("dodaj")) {
                String[] slowa = komenda.split(" ");

                String nazwa = slowa[1];
                double cena = Double.parseDouble(slowa[2]);

                OfertaSprzedazy ofertaSprzedazy = new OfertaSprzedazy(nazwa, cena);
                oferty.add(ofertaSprzedazy);
            } else if (komenda.startsWith("listuj")) {
                System.out.println();
                for (OfertaSprzedazy oferta : oferty) {
                    System.out.println(oferta.getNazwaProduktu() + " -> " + oferta.getCena());
                }
                System.out.println();
            }else if(komenda.startsWith("sortuj")){
                String[] slowa = komenda.split(" ");
                String kierunek = slowa[1];

                if(kierunek.equals("malejaco")){
                    oferty.sort(new ComparatorOfert(true));
                }else{
                    oferty.sort(new ComparatorOfert(false));
                }
            }
        }
    }
}
