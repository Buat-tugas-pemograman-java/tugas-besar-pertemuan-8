# Jawaban 5 – Sistem Tiket Bioskop

## Deskripsi
Program ini merupakan implementasi Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java.

Studi kasus Sistem Tiket Bioskop bertujuan untuk membuat program pemesanan tiket sederhana yang dapat menampilkan informasi pemesanan dan menghitung total harga tiket berdasarkan harga tiket dan jumlah pembelian.

Program menggunakan `ArrayList` untuk menyimpan kumpulan objek tiket secara dinamis dan menampilkan data pemesanan melalui proses perulangan.

## Ketentuan Soal
Berdasarkan instruksi tugas, program memiliki ketentuan:
- Membuat class `Tiket`.
- Mendeklarasikan atribut `kodeTiket`, `namaFilm`, `jenisTiket`, `hargaTiket`, dan `jumlahTiket`.
- Mengimplementasikan constructor.
- Mengimplementasikan method `tampilData()`.
- Mengimplementasikan method `hitungTotal()` dengan tipe data `double`.
- Menggunakan rumus perhitungan `total = hargaTiket × jumlahTiket`.
- Menggunakan `ArrayList` untuk menyimpan kumpulan objek tiket.
- Menggunakan mekanisme iterasi pada class `Main` untuk menampilkan data pemesanan tiket.

## Struktur Project

```text
jawaban5/
├── README.md
├── Tiket.java
├── Main.java
├── Tiket.class
└── Main.class
```

## Implementasi

### 1. Class Tiket
Class `Tiket` digunakan sebagai blueprint untuk membuat objek pemesanan tiket bioskop.

Atribut yang digunakan:
- `kodeTiket` bertipe `String`.
- `namaFilm` bertipe `String`.
- `jenisTiket` bertipe `String`.
- `hargaTiket` bertipe `double`.
- `jumlahTiket` bertipe `int`.

Class ini memiliki:
- Constructor untuk menginisialisasi atribut tiket.
- Method `tampilData()` untuk menampilkan informasi pemesanan tiket.
- Method `hitungTotal()` untuk menghitung total harga tiket berdasarkan harga dan jumlah tiket, kemudian mengembalikan hasil menggunakan `return`.

### 2. Class Main
Class `Main` digunakan sebagai program utama untuk mengelola kumpulan objek tiket.

Implementasi pada class `Main` meliputi:
- Membuat collection `ArrayList<Tiket>`.
- Menambahkan objek tiket ke dalam ArrayList.
- Menggunakan mekanisme looping untuk mengakses seluruh data tiket.
- Menampilkan informasi pemesanan tiket dalam format struk melalui console.
- Menghitung total harga setiap pemesanan berdasarkan jumlah tiket.

Data pemesanan tiket yang digunakan:

| Atribut | Tiket 1 | Tiket 2 | Tiket 3 |
|---|---|---|---|
| Kode Tiket | T001 | T002 | T003 |
| Film | Agak Laen | Jumbo | Keluarga Cemara |
| Jenis Tiket | Reguler | VIP | Reguler |
| Harga | 40000 | 60000 | 35000 |
| Jumlah | 2 | 1 | 3 |
| Total | 80000 | 60000 | 105000 |

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terinstal.

Buka terminal pada folder `src` (root repository), kemudian jalankan:

**1. Compile program**

```bash
javac jawaban5/*.java
```

**2. Jalankan program**

```bash
java jawaban5.Main
```

## Output Program

```text
          DATA PEMESANAN TIKET
========================================
Kode Tiket : T001
Film       : Agak Laen
Jenis Tiket: Reguler
Harga      : 40000.0
Jumlah     : 2
Total      : 80000.0
========================================

          DATA PEMESANAN TIKET
========================================
Kode Tiket : T002
Film       : Jumbo
Jenis Tiket: VIP
Harga      : 60000.0
Jumlah     : 1
Total      : 60000.0
========================================

          DATA PEMESANAN TIKET
========================================
Kode Tiket : T003
Film       : Keluarga Cemara
Jenis Tiket: Reguler
Harga      : 35000.0
Jumlah     : 3
Total      : 105000.0
========================================
```

## Konsep PBO yang Diterapkan

1. **Class & Object** – Membuat class `Tiket` dan beberapa objek pemesanan tiket.
2. **Attribute** – Mendeklarasikan atribut untuk menyimpan informasi tiket.
3. **Constructor** – Menginisialisasi nilai atribut ketika objek dibuat.
4. **Method void** – Menggunakan method `tampilData()` untuk menampilkan informasi pemesanan.
5. **Method non-void** – Menggunakan method `hitungTotal()` untuk menghitung dan mengembalikan total harga tiket menggunakan `return`.
6. **Collection (ArrayList)** – Menyimpan kumpulan objek tiket secara dinamis.
7. **Looping / Iteration** – Menggunakan perulangan untuk menampilkan seluruh data pemesanan tiket.

**Note:**
-saya push file .class supaya ada evidance bahawa saya menjalankan programnya
-Output program ditampilkan dalam bentuk struk pemesanan tiket dari terminal/console