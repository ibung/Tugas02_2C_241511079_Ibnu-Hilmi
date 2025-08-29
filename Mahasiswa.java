public class Mahasiswa {
    private String nama;
    private String nim;
    private String kelas;
    
    // Constructor
    public Mahasiswa(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
    }
    
    // Getter
    public String getNama() {
        return nama;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getKelas() {
        return kelas;
    }
    
    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    // Method
    public void displayInfo() {
        System.out.println("\n========== Data Mahasiswa ==========");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("=====================================");
    }
}