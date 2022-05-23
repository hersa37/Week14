/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo.week14.astract;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public abstract class Pegawai {
    
    private String pegawaiID;
    private String nama;
    protected double gajiPokok;
    
    public Pegawai(){
        this("","");
    }
    
    public Pegawai(String nama, String pegawaiID){
        this.nama=nama;
        this.pegawaiID=pegawaiID;
    }
    
    public void setPegawaiID(String pegawaiID){
        this.pegawaiID=pegawaiID;
    }
    
    public String getPegawaiID() {
        return pegawaiID;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public abstract double getGajiTotal();
    
    @Override
    public String toString(){
        return "Name: "+getNama()
                +"; ID: "+pegawaiID;
    }
}
