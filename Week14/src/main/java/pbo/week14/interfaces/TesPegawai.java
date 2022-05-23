/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo.week14.interfaces;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author echa
 */
public class TesPegawai {

    public static void main(String[] args) {
        double gaji = 15000000;
        Pegawai[] daftarPegawai = new Pegawai[5];
        daftarPegawai[0] = new Manajer("Echa","M001");
        daftarPegawai[0].setGajiPokok(gaji);
        ((Manajer) daftarPegawai[0]).setTunjangan(10000000);
        daftarPegawai[1] = new Sekretaris("Terry", "Sek001");
        daftarPegawai[1].setGajiPokok(gaji);
        daftarPegawai[2] = new Sales("Rock", "Sa0001");
        daftarPegawai[2].setGajiPokok(gaji);
        ((Sales) daftarPegawai[2]).setJumlahBarang(200);
        daftarPegawai[3] = new Sales("Eli","Sa0002");
        daftarPegawai[3].setGajiPokok(gaji);
        ((Sales) daftarPegawai[3]).setJumlahBarang(157);
        daftarPegawai[4] = new Sales("Rob","Sa0003");
        daftarPegawai[4].setGajiPokok(gaji);
        ((Sales) daftarPegawai[4]).setJumlahBarang(421);

        Locale locale = new Locale("id", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);

        String manajerString="Manager\n";
        String salesString="Sales\n";
        String sekretarisString="Sekretaris\n";


        for(int i=0; i<daftarPegawai.length;i++){
            if (daftarPegawai[i] instanceof Manajer) {
                manajerString += daftarPegawai[i].toString() + ", dengan gaji total: " + format.format(daftarPegawai[i].getGajiTotal())+"\n";
            }
            if (daftarPegawai[i] instanceof Sales) {
                salesString += daftarPegawai[i].toString() + ", dengan gaji total: " + format.format(daftarPegawai[i].getGajiTotal())+"\n";
            }
            if (daftarPegawai[i] instanceof Sekretaris) {
                sekretarisString += daftarPegawai[i].toString() + ", dengan gaji total: " + format.format(daftarPegawai[i].getGajiTotal())+"\n";
            }
        }

        System.out.println("Daftar Pegawai:");
        System.out.println(manajerString);
        System.out.println(salesString);
        System.out.println(sekretarisString);
    }
}
