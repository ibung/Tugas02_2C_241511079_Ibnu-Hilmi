*** 📘 Sistem Peminjaman Barang Akademik ***

📌 Deskripsi

Program ini merupakan simulasi sederhana sistem peminjaman barang akademik berbasis Java.
Tujuan utamanya adalah untuk melatih penerapan konsep Object Oriented Programming (OOP) menggunakan class, constructor, getter, setter, dan method.

Sistem ini mengelola data mahasiswa sebagai peminjam serta daftar barang yang dapat dipinjam menggunakan ArrayList. Program dijalankan secara interaktif melalui terminal (CLI).

📂 Struktur File

Mahasiswa.java
Berisi parameter identitas mahasiswa (nama, nim, kelas), constructor, getter, setter, dan method untuk menampilkan data mahasiswa.

Peminjaman.java
Berisi parameter barang (namaBarang, jaminan, stok, jamPengambilan).
Versi terbaru menggunakan ArrayList untuk menampilkan pilihan barang (contoh: proyektor, kabel terminal, spidol, penghapus, dll).

Main.java
Berisi eksekusi program, mulai dari input data mahasiswa, pemilihan barang, pemilihan jaminan, hingga opsi Selesai.

🎯 Tujuan Program

Menyimpan data mahasiswa berupa nama, NIM, dan kelas.

Menampilkan daftar barang akademik dengan ArrayList.

Memberikan pilihan jaminan (KTP/SIM/KTMahasiswa).

Memungkinkan peminjaman lebih dari satu barang dengan sistem looping hingga memilih opsi Selesai.

Mengandalkan memori (tanpa file eksternal/database) agar lebih sederhana dan fokus pada praktik OOP.

🛠️ Lesson Learned

Pemahaman OOP: Membuat class terpisah, constructor, getter, setter, dan method sesuai kebutuhan.

Pemanfaatan ArrayList: Menyediakan daftar barang dinamis yang mudah ditambah/ubah.

Logika interaktif: Menggunakan looping agar mahasiswa bisa meminjam berkali-kali.

⚠️ Kekurangan Sistem

Belum real-time → masih berbasis input manual dan penyimpanan sementara di memori.

Output akhir kurang efektif → saat selesai seharusnya menampilkan rekap barang yang sedang dipinjam.

Tampilan berbasis CLI → masih sederhana, belum ada GUI agar lebih user-friendly.

▶️ Cara Menjalankan

Pastikan sudah menginstall Java JDK minimal versi 8.

Simpan semua file (Mahasiswa.java, Peminjaman.java, Main.java) dalam satu folder.

Buka terminal di folder tersebut.

Compile program:

javac Main.java


Jalankan program:

java Main

📚 Contoh Barang yang Bisa Dipinjam

Proyektor

Kabel Terminal

Spidol

Penghapus

Whiteboard

Kabel LAN

Pointer Presentasi

Speaker Portable

👨‍🎓 Pengembang

Nama: Ibnu Hilmi Athaillah

Prodi: D3 Informatika
