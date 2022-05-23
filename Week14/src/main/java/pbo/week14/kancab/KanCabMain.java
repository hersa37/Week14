package pbo.week14.kancab;

import pbo.week14.astract.Manajer;
import pbo.week14.astract.Pegawai;
import pbo.week14.astract.Sales;
import pbo.week14.astract.Sekretaris;


public class KanCabMain {
    public static void main(String[] args) {
        int jumlahPegawai=5;
        Pegawai[] daftarPegawai = new Pegawai[KantorCabang.MAX_PEGAWAI];

        KantorCabang kanCab=new KantorCabang("KC0001",daftarPegawai,jumlahPegawai);

        Manajer echa=new Manajer("Echa","M001");
        echa.setGajiPokok(15000000);
        echa.setTunjangan(13400000);
        daftarPegawai[0]=echa;

        Sekretaris galih = new Sekretaris("Galih", "SK001");
        galih.setGajiPokok(12000000);
        daftarPegawai[1] = galih;

        Sales bernardus = new Sales("Bernardus", "SL001");
        bernardus.setJumlahBarang(150);
        bernardus.setGajiPokok(4000000);
        daftarPegawai[2] = bernardus;

        Sales prakoso = new Sales("Prakoso", "SL002");
        prakoso.setJumlahBarang(139);
        prakoso.setGajiPokok(4000000);
        daftarPegawai[3] = prakoso;

        Sales hersa = new Sales("Hersa", "SL003");
        hersa.setJumlahBarang(102);
        hersa.setGajiPokok(4000000);
        daftarPegawai[4] = hersa;


        System.out.println(kanCab);
        System.out.println(kanCab.cetakGajiTotalSetiapPegawai());
    }


}
