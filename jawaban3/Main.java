package jawaban3;

public class Main {
    public static void main(String[] args) {
        Menu menu1 = new Menu();
        Menu menu2 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");

        menu2.tampilMenu();
        int jumlah = 2;
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total : " + menu2.hitungHarga(jumlah));
    }
}
