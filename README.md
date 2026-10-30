# Tugas Pemrograman Berorientasi Objek (PBO)

## Deskripsi
Repository ini berisi hasil pengerjaan Tugas Besar dan Kuis UTS mata kuliah Pemrograman Berorientasi Objek (PBO) menggunakan bahasa Java.

Tugas terdiri dari lima studi kasus yang menerapkan konsep dasar Object-Oriented Programming (OOP), mulai dari pembuatan class dan object, penggunaan constructor, encapsulation, method, hingga pengelolaan collection menggunakan `ArrayList`.

## Daftar Jawaban

| No. | Studi Kasus | Konsep Utama |
|---|---|---|
| 1 | Sistem Data Buku | Class, Object, Attribute, Constructor, Method void |
| 2 | Sistem Rental Sepeda | Encapsulation, Constructor, `this`, Method non-void |
| 3 | Sistem Kafe | Constructor Overloading, Method Parameter, Return |
| 4 | Sistem Data Pemeriksaan Klinik | Encapsulation, ArrayList, Looping, Iteration |
| 5 | Sistem Tiket Bioskop | Class, Object, ArrayList, Looping, Perhitungan Total |

## Struktur Repository

```text
folder_kamu_yang_pull/
├── README.md
│
├── jawaban1/
│   ├── README.md
│   ├── Buku.java
│   ├── Main.java
│   ├── Buku.class
│   └── Main.class
│
├── jawaban2/
│   ├── README.md
│   ├── Sepeda.java
│   ├── Main.java
│   ├── Sepeda.class
│   └── Main.class
│
├── jawaban3/
│   ├── README.md
│   ├── Menu.java
│   ├── Main.java
│   ├── Menu.class
│   └── Main.class
│
├── jawaban4/
│   ├── README.md
│   ├── Pemeriksaan.java
│   ├── Main.java
│   ├── Pemeriksaan.class
│   └── Main.class
│
└── jawaban5/
    ├── README.md
    ├── Tiket.java
    ├── Main.java
    ├── Tiket.class
    └── Main.class
```

## Teknologi yang Digunakan

- Java
- Java Development Kit (JDK)
- Visual Studio Code
- Git & GitHub

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terinstal pada komputer.

Seluruh perintah dijalankan melalui terminal pada folder `src` sebagai root repository.

### Jawaban 1 – Sistem Data Buku

Compile:

```bash
javac jawaban1/*.java
```

Run:

```bash
java jawaban1.Main
```

### Jawaban 2 – Sistem Rental Sepeda

Compile:

```bash
javac jawaban2/*.java
```

Run:

```bash
java jawaban2.Main
```

### Jawaban 3 – Sistem Kafe

Compile:

```bash
javac jawaban3/*.java
```

Run:

```bash
java jawaban3.Main
```

### Jawaban 4 – Sistem Data Pemeriksaan Klinik

Compile:

```bash
javac jawaban4/*.java
```

Run:

```bash
java jawaban4.Main
```

### Jawaban 5 – Sistem Tiket Bioskop

Compile:

```bash
javac jawaban5/*.java
```

Run:

```bash
java jawaban5.Main
```

## Konsep PBO yang Dipelajari

Melalui pengerjaan lima studi kasus ini, beberapa konsep Pemrograman Berorientasi Objek yang diterapkan meliputi:

1. **Class & Object** – Membuat class sebagai blueprint dan object sebagai instance dari class.
2. **Attribute** – Mendeklarasikan variabel untuk menyimpan data objek.
3. **Encapsulation** – Membatasi akses atribut menggunakan access modifier `private`.
4. **Constructor** – Menginisialisasi atribut ketika objek dibuat.
5. **Constructor Overloading** – Membuat beberapa constructor dengan parameter berbeda.
6. **Keyword this** – Mengakses atribut objek dan memanggil constructor lainnya.
7. **Method void** – Membuat method untuk menampilkan informasi objek.
8. **Method non-void** – Membuat method yang mengembalikan nilai menggunakan `return`.
9. **ArrayList** – Menyimpan kumpulan objek secara dinamis.
10. **Looping / Iteration** – Melakukan perulangan untuk mengakses dan menampilkan data collection.

## Dokumentasi

Setiap folder jawaban memiliki file `README.md` masing-masing yang berisi:
- Deskripsi studi kasus.
- Ketentuan soal.
- Struktur project.
- Penjelasan implementasi class.
- Data yang digunakan.
- Cara menjalankan program.
- Output program.
- Konsep PBO yang diterapkan.

**Note:**
- File `.java` merupakan source code utama program.
- File `.class` tetap disertakan dalam repository sebagai evidence hasil kompilasi dan eksekusi program.
- Setiap jawaban menggunakan package masing-masing (`jawaban1` sampai `jawaban5`).