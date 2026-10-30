# Jawaban 1 – Sistem Data Buku

## Deskripsi
Program ini merupakan implementasi sederhana Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java.

Studi kasus Sistem Data Buku bertujuan untuk membuat program sederhana yang dapat merekam dan menampilkan data inventaris buku yang dijual pada toko buku.

## Ketentuan Soal
Berdasarkan instruksi tugas, program memiliki ketentuan:
- Membuat class `Buku`.
- Mendeklarasikan atribut minimal `kodeBuku`, `judul`, `penulis`, dan `harga`.
- Mengimplementasikan constructor.
- Mengimplementasikan method `tampilData()`.
- Membuat minimal 2 objek buku yang berhasil diinisialisasi dan ditampilkan ke layar.

## Struktur Project

```text
jawaban1/
├── README.md
├── Buku.java
└── Main.java
```

## Implementasi

### 1. Class Buku
Class `Buku` digunakan sebagai blueprint untuk membuat objek buku.

Atribut yang digunakan:
- `kodeBuku` bertipe `String`.
- `judul` bertipe `String`.
- `penulis` bertipe `String`.
- `harga` bertipe `double`.

Class ini memiliki constructor untuk menginisialisasi atribut buku dan method `tampilData()` untuk menampilkan informasi buku.

### 2. Class Main
Class `Main` digunakan sebagai program utama untuk membuat dan menampilkan dua objek dari class `Buku`.

Data buku yang digunakan:

| Atribut | Buku 1 | Buku 2 |
|---|---|---|
| Kode Buku | B001 | B002 |
| Judul | Laskar Pelangi | Bumi |
| Penulis | Andrea Hirata | Tere Liye |
| Harga | 85000 | 95000 |

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terinstal.

Buka terminal pada folder `src` (root repository), kemudian jalankan:

**1. Compile program**

```bash
javac jawaban1/*.java
```

**2. Jalankan program**

```bash
java jawaban1.Main
```

## Output Program

```text
Kode Buku : B001
Judul     : Laskar Pelangi
Penulis   : Andrea Hirata
Harga     : 85000.0

Kode Buku : B002
Judul     : Bumi
Penulis   : Tere Liye
Harga     : 95000.0
```

## Konsep PBO yang Diterapkan

1. **Class & Object** – Membuat class `Buku` dan dua objek buku.
2. **Attribute** – Mendeklarasikan atribut untuk menyimpan informasi buku.
3. **Constructor Dasar** – Menginisialisasi nilai atribut ketika objek dibuat.
4. **Method void** – Menggunakan method `tampilData()` untuk menampilkan informasi buku.


**Note**:
-saya push file .class supaya ada evidance bahawa saya menjalankan programnya