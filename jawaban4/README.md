# Jawaban 4 – Sistem Data Pemeriksaan Klinik

## Deskripsi
Program ini merupakan implementasi Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java.

Studi kasus Sistem Data Pemeriksaan Klinik bertujuan untuk membuat program sederhana yang dapat mengelola data pemeriksaan pasien tanpa menggunakan database SQL. Data pemeriksaan disimpan secara dinamis menggunakan `ArrayList` dan ditampilkan melalui proses perulangan.

## Ketentuan Soal
Berdasarkan instruksi tugas, program memiliki ketentuan:
- Membuat class `Pemeriksaan`.
- Mendeklarasikan atribut `noPemeriksaan`, `namaPasien`, `namaDokter`, dan `biayaPemeriksaan`.
- Menggunakan access modifier `private` pada seluruh atribut.
- Mengimplementasikan constructor dengan keyword `this`.
- Mengimplementasikan method `tampilData()`.
- Mengimplementasikan method `hitungTotal()` dengan tipe data `double`.
- Membuat `ArrayList<Pemeriksaan>` pada class `Main`.
- Memasukkan minimal 3 objek pemeriksaan ke dalam ArrayList.
- Menampilkan seluruh data pemeriksaan menggunakan mekanisme looping (`for` atau `foreach`).
- Menghitung dan menampilkan total seluruh biaya pemeriksaan secara otomatis.

## Struktur Project

```text
jawaban4/
├── README.md
├── Pemeriksaan.java
├── Main.java
├── Pemeriksaan.class
└── Main.class
```

## Implementasi

### 1. Class Pemeriksaan
Class `Pemeriksaan` digunakan sebagai blueprint untuk membuat objek data pemeriksaan pasien.

Atribut yang digunakan:
- `noPemeriksaan` bertipe `String`.
- `namaPasien` bertipe `String`.
- `namaDokter` bertipe `String`.
- `biayaPemeriksaan` bertipe `double`.

Seluruh atribut menggunakan access modifier `private` sebagai penerapan encapsulation.

Class ini memiliki:
- Constructor untuk menginisialisasi atribut menggunakan keyword `this`.
- Method `tampilData()` untuk menampilkan informasi pemeriksaan pasien.
- Method `hitungTotal()` untuk mengembalikan nilai biaya pemeriksaan menggunakan `return`.

### 2. Class Main
Class `Main` digunakan sebagai program utama untuk mengelola kumpulan objek pemeriksaan.

Implementasi pada class `Main` meliputi:
- Membuat collection `ArrayList<Pemeriksaan>`.
- Menambahkan minimal 3 objek pemeriksaan ke dalam ArrayList.
- Melakukan iterasi menggunakan looping untuk menampilkan seluruh data pemeriksaan.
- Menghitung akumulasi seluruh biaya pemeriksaan secara otomatis.

Data pemeriksaan yang digunakan:

| Atribut | Pemeriksaan 1 | Pemeriksaan 2 | Pemeriksaan 3 |
|---|---|---|---|
| No Pemeriksaan | P001 | P002 | P003 |
| Nama Pasien | Andi | Siti | Doni |
| Nama Dokter | Dr. Budi | Dr. Rina | Dr. Budi |
| Biaya | 150000 | 200000 | 175000 |

**Total seluruh biaya pemeriksaan: 525000**

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terinstal.

Buka terminal pada folder `src` (root repository), kemudian jalankan:

**1. Compile program**

```bash
javac jawaban4/*.java
```

**2. Jalankan program**

```bash
java jawaban4.Main
```

## Output Program

```text
No Pemeriksaan : P001
Nama Pasien    : Andi
Nama Dokter    : Dr. Budi
Biaya          : 150000.0

No Pemeriksaan : P002
Nama Pasien    : Siti
Nama Dokter    : Dr. Rina
Biaya          : 200000.0

No Pemeriksaan : P003
Nama Pasien    : Doni
Nama Dokter    : Dr. Budi
Biaya          : 175000.0

Total seluruh biaya pemeriksaan: 525000.0
```

## Konsep PBO yang Diterapkan

1. **Class & Object** – Membuat class `Pemeriksaan` dan tiga objek pemeriksaan.
2. **Encapsulation** – Menggunakan access modifier `private` untuk membatasi akses atribut.
3. **Constructor** – Menginisialisasi atribut objek menggunakan keyword `this`.
4. **Method void** – Menggunakan method `tampilData()` untuk menampilkan informasi pemeriksaan.
5. **Method non-void** – Menggunakan method `hitungTotal()` untuk mengembalikan nilai biaya pemeriksaan.
6. **Collection (ArrayList)** – Menyimpan kumpulan objek pemeriksaan secara dinamis.
7. **Looping / Iteration** – Menggunakan perulangan untuk menampilkan seluruh data pemeriksaan dan menghitung total biaya secara otomatis.

**Note:**
-saya push file .class supaya ada evidance bahawa saya menjalankan programnya
-Program ini tidak menggunakan database SQL, sesuai dengan ketentuan soal.
