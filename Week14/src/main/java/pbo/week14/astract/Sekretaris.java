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
public class Sekretaris extends Pegawai{

    public Sekretaris() {
        super();
    }
    
    public Sekretaris(String name, String pegawaiID){
        super(name, pegawaiID);
    }
    
    public double getGajiTotal(){
        return getGajiPokok();
    }
    
}
