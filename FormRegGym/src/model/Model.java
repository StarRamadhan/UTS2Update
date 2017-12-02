package model;

import View.formRegistrasi;

/**
 *
 * @author
 */


public class Model {

    /**
     * @param args the command line arguments
     */
    private String noKTP, nama, kelamin = "", cabang, handuk = "", paket,
            biaya = "";

    public String getNoKTP() {
        return noKTP;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelamin() {
        return kelamin;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public String getHanduk() {
        return handuk;
    }

    public void setHanduk(String handuk) {
        this.handuk = handuk;
    }

    public String getPaket() {
        return paket;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

    
    public static void main(String[] args) {
        // main program hire
         new formRegistrasi().setVisible(true);   
    }
}
