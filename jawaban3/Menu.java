package jawaban3;

public class Menu {
    String kodeMenu;
    String namaMenu;
    double harga;
    String kategori;

    public Menu() {
        this("M00", "Menu Umum", 0, "Umum");
    }

    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public void tampilMenu() {
        System.out.println("Kode  : " + kodeMenu);
        System.out.println("Nama  : " + namaMenu);
        System.out.println("Harga : " + harga);
        System.out.println("Kategori: " + kategori);
    }

    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}
