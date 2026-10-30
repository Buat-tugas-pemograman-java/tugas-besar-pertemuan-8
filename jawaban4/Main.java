package jawaban4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pemeriksaan> daftarPemeriksaan = new ArrayList<>();

        daftarPemeriksaan.add(new Pemeriksaan("P001", "Andi", "Dr. Budi", 150000));
        daftarPemeriksaan.add(new Pemeriksaan("P002", "Siti", "Dr. Rina", 200000));
        daftarPemeriksaan.add(new Pemeriksaan("P003", "Doni", "Dr. Budi", 175000));

        double totalBiaya = 0;
        for (Pemeriksaan pemeriksaan : daftarPemeriksaan) {
            pemeriksaan.tampilData();
            totalBiaya += pemeriksaan.hitungTotal();
            System.out.println();
        }

        System.out.println("Total seluruh biaya pemeriksaan: " + totalBiaya);
    }
}
