
package jawaban3;

public class Main {
    public static void main(String[] args) {

        Menu menu1 = new Menu();
        
        System.out.println("=== MENU 1 ===");
        menu1.tampilMenu();
        Menu menu2 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");
        System.out.println("\n=== MENU 2 ===");
        menu2.tampilMenu();

        int jumlah = 2;

        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total : " + menu2.hitungHarga(jumlah));
    }
}
