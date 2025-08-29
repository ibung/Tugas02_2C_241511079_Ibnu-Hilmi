import java.util.ArrayList;

public class Peminjaman {
    private String namaBarang;
    private String jaminan;
    private int stok;
    private String jamPengambilan;
    
    // Constructor
    public Peminjaman(String namaBarang, String jaminan, int stok, String jamPengambilan) {
        this.namaBarang = namaBarang;
        this.jaminan = jaminan;
        this.stok = stok;
        this.jamPengambilan = jamPengambilan;
    }
    
    // Getter
    public String getNamaBarang() {
        return namaBarang;
    }
    
    public String getJaminan() {
        return jaminan;
    }
    
    public int getStok() {
        return stok;
    }
    
    public String getJamPengambilan() {
        return jamPengambilan;
    }
    
    // Setter
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    
    public void setJaminan(String jaminan) {
        this.jaminan = jaminan;
    }
    
    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void setJamPengambilan(String jamPengambilan) {
        this.jamPengambilan = jamPengambilan;
    }
    
    // Method
    public void printBarang() {
        System.out.println("---------- Detail Peminjaman -----------");
        System.out.println("Nama Barang      : " + namaBarang);
        System.out.println("Jaminan          : " + jaminan);
        System.out.println("Stok Tersisa     : " + stok);
        System.out.println("Jam Pengambilan  : " + jamPengambilan);
        System.out.println("---------------------------------------");
    }
}