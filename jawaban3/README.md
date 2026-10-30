# Jawaban 3 – Sistem Kafe

## Deskripsi
Program ini merupakan implementasi Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java.

Studi kasus Sistem Kafe bertujuan untuk membuat program sederhana yang dapat menampilkan informasi menu dan menghitung total harga pesanan berdasarkan jumlah yang dimasukkan.

## Ketentuan Soal
Berdasarkan instruksi tugas, program memiliki ketentuan:
- Membuat class `Menu`.
- Mendeklarasikan atribut `kodeMenu`, `namaMenu`, `harga`, dan `kategori`.
- Mengimplementasikan constructor tanpa parameter dan constructor dengan parameter (Overloading).
- Mengimplementasikan method `tampilMenu()`.
- Mengimplementasikan method `hitungHarga(int jumlah)` dengan tipe data `double`.
- Menggunakan parameter `jumlah` untuk menghitung total harga pesanan.

Rumus perhitungan:

`total = harga × jumlah`

## Struktur Project

```text
jawaban3/
├── README.md
├── Menu.java
├── Main.java
├── Menu.class
└── Main.class
```

## Implementasi

### 1. Class Menu
Class `Menu` digunakan sebagai blueprint untuk membuat objek menu makanan atau minuman pada sistem kafe.

Atribut yang digunakan:
- `kodeMenu` bertipe `String`.
- `namaMenu` bertipe `String`.
- `harga` bertipe `double`.
- `kategori` bertipe `String`.

Class ini memiliki:
- Constructor tanpa parameter untuk inisialisasi objek tanpa nilai awal.
- Constructor dengan parameter untuk menginisialisasi atribut berdasarkan data yang diberikan.
- Method `tampilMenu()` untuk menampilkan informasi menu.
- Method `hitungHarga(int jumlah)` untuk menghitung total harga berdasarkan jumlah pesanan dan mengembalikan hasil menggunakan `return`.

### 2. Class Main
Class `Main` digunakan sebagai program utama untuk membuat objek dari class `Menu`, menampilkan informasi menu, dan menghitung total harga berdasarkan jumlah pesanan.

Data menu yang digunakan:

| Atribut | Nilai |
|---|---|
| Kode Menu | M01 |
| Nama Menu | Nasi Goreng |
| Harga | 18000 |
| Kategori | Makanan |
| Jumlah | 2 |
| Total | 36000 |

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terinstal.

Buka terminal pada folder `src` (root repository), kemudian jalankan:

**1. Compile program**

```bash
javac jawaban3/*.java
```

**2. Jalankan program**

```bash
java jawaban3.Main
```

## Output Program

```text
Kode   : M01
Nama   : Nasi Goreng
Harga  : 18000.0
Kategori: Makanan
Jumlah : 2
Total  : 36000.0
```

## Konsep PBO yang Diterapkan

1. **Class & Object** – Membuat class `Menu` dan objek menu.
2. **Attribute** – Mendeklarasikan atribut untuk menyimpan informasi menu.
3. **Constructor Overloading** – Menyediakan dua constructor, yaitu tanpa parameter dan dengan parameter.
4. **Method void** – Menggunakan method `tampilMenu()` untuk menampilkan informasi menu.
5. **Method dengan Parameter** – Menggunakan parameter `jumlah` pada method `hitungHarga(int jumlah)`.
6. **Method non-void** – Mengembalikan hasil perhitungan total harga menggunakan tipe data `double` dan `return`.

**Note:**
-saya push file .class supaya ada evidance bahawa saya menjalankan programnya