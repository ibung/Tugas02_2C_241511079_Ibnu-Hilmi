import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ArrayList untuk barang yang tersedia
        ArrayList<String> daftarBarang = new ArrayList<>();
        ArrayList<Integer> stokBarang = new ArrayList<>();
        
        // Menambahkan barang-barang yang bisa dipinjam
        daftarBarang.add("Proyektor");
        stokBarang.add(5);
        daftarBarang.add("Kabel HDMI");
        stokBarang.add(10);
        daftarBarang.add("Spidol Whiteboard");
        stokBarang.add(20);
        daftarBarang.add("Penghapus Whiteboard");
        stokBarang.add(15);
        daftarBarang.add("Laptop");
        stokBarang.add(3);
        
        // ArrayList untuk pilihan jaminan
        ArrayList<String> jenisJaminan = new ArrayList<>();
        jenisJaminan.add("KTP");
        jenisJaminan.add("SIM");
        jenisJaminan.add("KTM");
        
        System.out.println("======= SISTEM PEMINJAMAN BARANG JTK =======");
        
        // Input data mahasiswa
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        
        // Membuat object Mahasiswa menggunakan Constructor
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, kelas);
        
        // Menampilkan info mahasiswa menggunakan Method
        mahasiswa.displayInfo();
        
        // Loop untuk peminjaman barang
        boolean lanjut = true;
        while (lanjut) {
            // Tampilkan menu barang
            System.out.println("\n===== Pilih Barang =====");
            for (int i = 0; i < daftarBarang.size(); i++) {
                System.out.println((i + 1) + ". " + daftarBarang.get(i) + " (Stok: " + stokBarang.get(i) + ")");
            }
            System.out.println("6. Selesai");
            
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            
            if (pilihan == 6) {
                lanjut = false;
                System.out.println("Selesai!");
            } else if (pilihan >= 1 && pilihan <= 5) {
                String barangDipilih = daftarBarang.get(pilihan - 1);
                int stokSekarang = stokBarang.get(pilihan - 1);
                
                if (stokSekarang > 0) {
                    // Tampilkan pilihan jaminan
                    System.out.println("\n===== Pilih Jaminan =====");
                    for (int i = 0; i < jenisJaminan.size(); i++) {
                        System.out.println((i + 1) + ". " + jenisJaminan.get(i));
                    }
                    
                    System.out.print("Pilihan jaminan: ");
                    int pilihanJaminan = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer
                    
                    // Input jam pengambilan manual
                    System.out.print("Masukkan jam pengambilan (format '17.30' atau '02.30'): ");
                    String jamPengambilan = scanner.nextLine();
                    
                    String jaminanDipilih = jenisJaminan.get(pilihanJaminan - 1);
                    
                    // Kurangi stok
                    stokBarang.set(pilihan - 1, stokSekarang - 1);
                    
                    // Membuat object Peminjaman menggunakan Constructor
                    Peminjaman peminjaman = new Peminjaman(barangDipilih, jaminanDipilih, 
                                                         stokBarang.get(pilihan - 1), jamPengambilan);
                    
                    // Tampilkan hasil menggunakan Method
                    peminjaman.printBarang();
                    
                } else {
                    System.out.println("Maaf, stok habis!");
                }
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        
        System.out.println("Terima kasih!");
    }
}