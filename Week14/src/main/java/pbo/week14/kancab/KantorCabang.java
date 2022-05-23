/*
 *  Made for college assignments/personal projects.
 *  Do not use without permission
 */

package pbo.week14.kancab;


import pbo.week14.astract.Manajer;
import pbo.week14.astract.Pegawai;
import pbo.week14.astract.Sales;
import pbo.week14.astract.Sekretaris;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author echa
 * Bernardus Hersa Galih Prakoso - 215314018
 * Informatika - Universitas Sanata Dharma
 */
public class KantorCabang {
    public static final int MAX_PEGAWAI=100; //Constant owned by KantorCabang
    
    private String kodeCabang;

    private Pegawai[] pegawai; //Array of Pegawai objects
    private int jumlahPegawai;
    
    /*
    *Default constructor that calls constructor with corresponding parameters
    */
    public KantorCabang(){
        this("",new Pegawai[MAX_PEGAWAI],0);
    }
    /*
    Constructor with KanCab kode and pimpinan
    */    
    public KantorCabang(String kode, Pegawai[] pegawai, int jumlahPegawai){
        kodeCabang=kode;
        this.pegawai=pegawai;
        this.jumlahPegawai=jumlahPegawai;//Assigns array with the size of MAX_PEGAWAI
    }   

    public String getKodeCabang() {
        return kodeCabang;
    }

    public void setKodeCabang(String kodeCabang) {
        this.kodeCabang = kodeCabang;
    }

    public Pegawai[] getPegawai() {
        return pegawai;
    }
    /*
    sets array of pegawai and sets jumlahpegawai to actual number of pegawai
    Array size stays at MAX_PEGAWAI
    */
    public void setPegawai(Pegawai[] pegawai, int jumlahPegawai) {
        this.pegawai = pegawai;
        this.jumlahPegawai=jumlahPegawai;
    }
    
    public int getJumlahPegawai(){
        return jumlahPegawai;
    }
    
    /*
    Adds new Pegawai at first null index, which is at jumlahPegawai
    */
    public void addPegawai(Pegawai pegawaiNew){
        if(jumlahPegawai<MAX_PEGAWAI){
            pegawai[jumlahPegawai]=pegawaiNew;
            jumlahPegawai++;
        } else System.out.println("FULL");        
    }
    
    /*
    Removes pegawai by putting last non-null index to desired index, then 
    sets last non-null index to null. Updates jumlahPegawai
    */
    public void removePegawai(int index){
        pegawai[index]=pegawai[jumlahPegawai-1];
        pegawai[jumlahPegawai-1]=null;
        jumlahPegawai--;
    }
    
    /*
    Sets first index as baseline. Compares to the rest of the array up to 
    last non-null index
    */
    public Pegawai getPegawaiGajiTerbesar(){
        Pegawai gajiMax=pegawai[0];
        for(int i=1;i<jumlahPegawai;i++){
            if(pegawai[i].getGajiTotal()>gajiMax.getGajiTotal()){
                gajiMax=pegawai[i];
            }
        }
        return gajiMax;
    }
    
    public Pegawai getPegawaiGajiTerkecil(){
        Pegawai gajiMin=pegawai[0];
        for(int i=1;i<jumlahPegawai;i++){
            if(pegawai[i].getGajiTotal()<gajiMin.getGajiTotal()){
                gajiMin=pegawai[i];
            }
        }
        return gajiMin;
    }
    
    public Pegawai findPegawai(String name){
        for(int i=0;i<jumlahPegawai;i++){
            if(name.equals(pegawai[i].getNama())){
                return pegawai[i];
            }
        }
        System.out.println("Pegawai not found");
        return null;
    }
    public  String cetakGajiTotalSetiapPegawai(){
        String manajerString="Manager\n";
        String salesString="Sales\n";
        String sekretarisString="Sekretaris\n";

        Locale locale = new Locale("id", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(locale);

        for(int i=0; i<jumlahPegawai;i++){
            if (pegawai[i] instanceof Manajer) {
                manajerString += pegawai[i].toString() + ", dengan gaji total: " + format.format(pegawai[i].getGajiTotal())+"\n";
            }
            if (pegawai[i] instanceof Sales) {
                salesString += pegawai[i].toString() + ", dengan gaji total: " + format.format(pegawai[i].getGajiTotal())+"\n";
            }
            if (pegawai[i] instanceof Sekretaris) {
                sekretarisString += pegawai[i].toString() + ", dengan gaji total: " + format.format(pegawai[i].getGajiTotal())+"\n";
            }
        }

        return "Daftar gaji pegawai:\n"
                +manajerString+"\n"
                +sekretarisString+"\n"
                +salesString+"\n";
    }
    @Override
    public String toString(){
        return "Kode Kantor Cabang: "+kodeCabang;
    }  
}
