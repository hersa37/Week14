/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo.week14.interfaces;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class Sales extends Pegawai {
    public static final double KOMISI_PER_BARANG=10000;
    private int jumlahBarang;
    
    public Sales(){
        super();
    }
    
    public Sales(String nama, String pegawaiID){
        super(nama, pegawaiID);
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang=jumlahBarang;
    }
    
    public double getKomisi(){
        return jumlahBarang*Sales.KOMISI_PER_BARANG;
    }
    
    public double getGajiTotal(){
        return gajiPokok+(Sales.KOMISI_PER_BARANG*jumlahBarang);
    }
}
