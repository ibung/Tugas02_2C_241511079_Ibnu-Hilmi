# 📘 Sistem Peminjaman Barang Akademik

## 📌 Deskripsi
Program ini merupakan simulasi sederhana **sistem peminjaman barang akademik** berbasis **Java**.  
Tujuan utamanya adalah untuk melatih penerapan konsep **Object Oriented Programming (OOP)** menggunakan `class`, `constructor`, `getter`, `setter`, dan `method`.

Sistem ini mengelola data mahasiswa sebagai peminjam serta daftar barang yang dapat dipinjam menggunakan **ArrayList**. Program dijalankan secara interaktif melalui terminal (CLI).

---

## 📂 Struktur File
- **`Mahasiswa.java`**  
  Berisi parameter identitas mahasiswa (`nama`, `nim`, `kelas`), constructor, getter, setter, dan method untuk menampilkan data mahasiswa.  

- **`Peminjaman.java`**  
  Berisi parameter barang (`namaBarang`, `jaminan`, `stok`, `jamPengambilan`).  
  Versi terbaru menggunakan **ArrayList** untuk menampilkan pilihan barang (contoh: proyektor, kabel terminal, spidol, penghapus, dll).  

- **`Main.java`**  
  Berisi eksekusi program, mulai dari input data mahasiswa, pemilihan barang, pemilihan jaminan, hingga opsi `Selesai`.  

---

## 🎯 Tujuan Program
1. **Menyimpan data mahasiswa** berupa nama, NIM, dan kelas.  
2. **Menampilkan daftar barang** akademik dengan `ArrayList`.  
3. **Memberikan pilihan jaminan** (KTP/SIM/KTMahasiswa).  
4. **Memungkinkan peminjaman lebih dari satu barang** dengan sistem looping hingga memilih opsi `Selesai`.  
5. **Mengandalkan memori (tanpa file eksternal/database)** agar lebih sederhana dan fokus pada praktik OOP.  

---

## 🛠️ Lesson Learned
- **Pemahaman OOP**: Membuat class terpisah, constructor, getter, setter, dan method sesuai kebutuhan.  
- **Pemanfaatan ArrayList**: Menyediakan daftar barang dinamis yang mudah ditambah/ubah.  
- **Logika interaktif**: Menggunakan looping agar mahasiswa bisa meminjam berkali-kali.  

---

## ⚠️ Kekurangan Sistem
1. **Belum real-time** → masih berbasis input manual dan penyimpanan sementara di memori.  
2. **Output akhir kurang efektif** → saat selesai seharusnya menampilkan rekap barang yang sedang dipinjam.  
3. **Tampilan berbasis CLI** → masih sederhana, belum ada GUI agar lebih user-friendly.  

---

## ▶️ Cara Menjalankan
1. Pastikan sudah menginstall **Java JDK** minimal versi 8.  
2. Simpan semua file (`Mahasiswa.java`, `Peminjaman.java`, `Main.java`) dalam satu folder.  
3. Buka terminal di folder tersebut.  
4. Compile program:
   ```bash
   javac Main.java
5. Jalankan program:
   ```bash
   java Main

---

📚 Contoh Barang yang Bisa Dipinjam

Proyektor

Kabel Terminal

Spidol

Penghapus

Whiteboard

Kabel LAN

Pointer Presentasi

Speaker Portable

---

👨‍🎓 Pengembang

Nama: Ibnu Hilmi Athaillah

Prodi: D3 Informatika
