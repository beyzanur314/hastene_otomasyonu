/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.util.ArrayList;

public class KanTahlilSistemi {
    public ArrayList<KanTahlil> getKanTahlilleri() {
        // Burada uygun şekilde kan tahlillerini veritabanından veya başka bir kaynaktan alabilirsiniz
        ArrayList<KanTahlil> kanTahlilleri = new ArrayList<>();

        // Örnek kan tahlili verilerini ekleme
        kanTahlilleri.add(new KanTahlil(1, "Ahmet Yılmaz", "Normal"));
        kanTahlilleri.add(new KanTahlil(2, "Ayşe Kaya", "Yüksek"));
        kanTahlilleri.add(new KanTahlil(3, "Mehmet Demir", "Düşük"));

        return kanTahlilleri;
    }

    public class KanTahlil {
        private final int tahlilNo;
        private final String hastaAdi;
        private final String sonuc;

        public KanTahlil(int tahlilNo, String hastaAdi, String sonuc) {
            this.tahlilNo = tahlilNo;
            this.hastaAdi = hastaAdi;
            this.sonuc = sonuc;
        }

        public int getTahlilNo() {
            return tahlilNo;
        }

        public String getHastaAdi() {
            return hastaAdi;
        }

        public String getSonuc() {
            return sonuc;
        }
    }
}
