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
public class Manajer extends Pegawai {
    private double tunjangan;
    
    public Manajer(){
        super();
    }
    
    public Manajer(String nama, String pegawaiID){
        super(nama, pegawaiID);
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan=tunjangan;
    }    
    
    public double getGajiTotal(){
        return gajiPokok+tunjangan;
    }
    
}
