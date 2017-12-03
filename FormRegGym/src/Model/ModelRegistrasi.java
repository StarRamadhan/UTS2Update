package Model;

import View.formRegistrasi;

/**
 *
 * @author
 */
public class ModelRegistrasi {

    /**
     * @param args the command line arguments
     */
    private String noKTP, nama, kelamin = "", cabang, handuk = "", paket;
    private double biaya = 0;

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

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(Double biaya) {
        this.biaya = biaya;
    }

    public void biayaPaket() {
        switch (paket) {
            case "Reguler":
                biaya = 450000;
                break;
            case "Mahasiswa":
                biaya = 300000;
                break;
            case "Private":
                biaya = 750000;
                break;
            case "Premium":
                biaya = 1000000;
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        // main program hire
        new formRegistrasi().setVisible(true);
    }
}
