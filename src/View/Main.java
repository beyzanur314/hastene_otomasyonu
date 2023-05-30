/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.util.ArrayList;

/**
 *
 * @author altin
 */
public class Main {
    public static void main(String[] args) {
        Doktor_HastaListe hastaListe = new Doktor_HastaListe();
        ArrayList<KanTahlilSistemi.KanTahlil> kanTahlilleri = hastaListe.getKanTahlilleri();

        // Kan tahlillerini kullanarak istediğiniz işlemleri yapabilirsiniz
        for (KanTahlilSistemi.KanTahlil tahlil : kanTahlilleri) {
            System.out.println("Tahlil No: " + tahlil.getTahlilNo());
            System.out.println("Hasta Adı: " + tahlil.getHastaAdi());
            System.out.println("Sonuç: " + tahlil.getSonuc());
            System.out.println("-------------------------");
        }
    }

    private static class Doktor_HastaListe {

        public Doktor_HastaListe() {
        }

        private ArrayList<KanTahlilSistemi.KanTahlil> getKanTahlilleri() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
