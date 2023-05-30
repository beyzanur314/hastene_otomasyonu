
package Entity;

public class Randevu {

     private String doktorAdi;
    private String poliklinikAdi;
    private String randevuSaati;

    public Randevu(String doktorAdi, String poliklinikAdi, String randevuSaati) {
        this.doktorAdi = doktorAdi;
        this.poliklinikAdi = poliklinikAdi;
        this.randevuSaati = randevuSaati;
    }

    public String getDoktorAdi() {
        return doktorAdi;
    }

    public void setDoktorAdi(String doktorAdi) {
        this.doktorAdi = doktorAdi;
    }

    public String getPoliklinikAdi() {
        return poliklinikAdi;
    }

    public void setPoliklinikAdi(String poliklinikAdi) {
        this.poliklinikAdi = poliklinikAdi;
    }

    public String getRandevuSaati() {
        return randevuSaati;
    }

    public void setRandevuSaati(String randevuSaati) {
        this.randevuSaati = randevuSaati;
    }

    public String getPoliklinik() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getDoktoradi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getRandevusaati() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
