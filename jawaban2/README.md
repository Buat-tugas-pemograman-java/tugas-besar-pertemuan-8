# Jawaban 2 – Sistem Rental Sepeda

## Deskripsi
Program ini merupakan implementasi Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java.

Studi kasus Sistem Rental Sepeda bertujuan untuk membuat program sederhana yang dapat menghitung biaya sewa sepeda secara otomatis berdasarkan lama waktu penyewaan dan harga sewa per jam.

## Ketentuan Soal
Berdasarkan instruksi tugas, program memiliki ketentuan:
- Membuat class `Sepeda`.
- Mendeklarasikan atribut `kodeSepeda`, `jenisSepeda`, `lamaSewa`, dan `hargaPerJam`.
- Mengimplementasikan encapsulation menggunakan access modifier `private`.
- Menggunakan keyword `this` pada constructor.
- Mengimplementasikan method `hitungBiaya()` dengan tipe data `double`.
- Membuat minimal 2 objek sepeda.

Rumus perhitungan:

`total = lamaSewa × hargaPerJam`

## Struktur Project

```text
jawaban2/
├── README.md
├── Sepeda.java
├── Main.java
├── Sepeda.class
└── Main.class
```

## Implementasi

### 1. Class Sepeda
Class `Sepeda` digunakan sebagai blueprint untuk membuat objek sepeda.

Atribut yang digunakan:
- `kodeSepeda` bertipe `String`.
- `jenisSepeda` bertipe `String`.
- `lamaSewa` bertipe `int`.
- `hargaPerJam` bertipe `double`.

Seluruh atribut menggunakan access modifier `private` sebagai penerapan encapsulation.

Class ini memiliki:
- Constructor untuk menginisialisasi atribut menggunakan keyword `this`.
- Method `tampilData()` untuk menampilkan informasi sepeda.
- Method `hitungBiaya()` untuk menghitung total biaya sewa dan mengembalikan hasil menggunakan `return`.

### 2. Class Main
Class `Main` digunakan sebagai program utama untuk membuat dan menampilkan dua objek dari class `Sepeda`.

Data sepeda yang digunakan:

| Atribut | Sepeda 1 | Sepeda 2 |
|---|---|---|
| Kode Sepeda | S001 | S002 |
| Jenis Sepeda | Sepeda Gunung | Sepeda Lipat |
| Lama Sewa | 3 jam | 5 jam |
| Harga/Jam | 10000 | 8000 |
| Total Biaya | 30000 | 40000 |

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terinstal.

Buka terminal pada folder `src` (root repository), kemudian jalankan:

**1. Compile program**

```bash
javac jawaban2/*.java
```

**2. Jalankan program**

```bash
java jawaban2.Main
```

## Output Program

```text
Kode Sepeda : S001
Jenis Sepeda: Sepeda Gunung
Lama Sewa   : 3 jam
Harga/Jam   : 10000.0
Total Biaya : 30000.0

Kode Sepeda : S002
Jenis Sepeda: Sepeda Lipat
Lama Sewa   : 5 jam
Harga/Jam   : 8000.0
Total Biaya : 40000.0
```

## Konsep PBO yang Diterapkan

1. **Class & Object** – Membuat class `Sepeda` dan dua objek sepeda.
2. **Encapsulation** – Menggunakan access modifier `private` untuk membatasi akses atribut.
3. **Constructor** – Menginisialisasi atribut objek menggunakan keyword `this`.
4. **Method void** – Menggunakan method `tampilData()` untuk menampilkan informasi sepeda.
5. **Method non-void** – Menggunakan method `hitungBiaya()` untuk menghitung dan mengembalikan total biaya sewa menggunakan `return`.

**Note:**
-saya push file .class supaya ada evidance bahawa saya menjalankan programnya