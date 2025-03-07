package pemlanTugas1;
import java.util.Scanner;
public class MainMobil {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        // Instansiasi mobil m1
        Scanner sc = new Scanner(System.in);

        System.out.println("Membuat objek mobil...");
        Mobil m1 = new Mobil();
        System.out.println("=====================");


        // Mengambil input dari user agar interaktif (no 3)
        System.out.print("> Apa merk mobil anda : ");
        String merk = sc.nextLine();
        System.out.print("> Apa warna mobil anda : ");
        String warna = sc.nextLine();
        System.out.print("> Berapa nomor plat mobil anda : ");
        String nPlat = sc.nextLine();
        System.out.print("> Berapa kecepatan yang dapat ditempuh mobil anda (km/h) : ");
        int kecepatan = sc.nextInt();
        sc.nextLine();
        System.out.print("> Berapa jam waktu yang ditempuh mobil anda : ");
        double waktu = sc.nextDouble();


        System.out.println("=====================");
        m1.setKecepatan(kecepatan);
        m1.setManufaktur(merk);
        m1.setNoPlat(nPlat);
        m1.setWarna(warna);
        m1.setWaktu(waktu);
        m1.displayMessage();
        sc.close();
        // // Instansiasi mobil m2
        // Mobil m2 = new Mobil();
        // m2.setKecepatan(100);
        // m2.setManufaktur("Mitsubishi");
        // m2.setNoPlat("N 1134 AG");
        // m2.setWarna("Pink");
        // m2.displayMessage();
        // System.out.println("=====================");

        // // meribah warna objek m1
        // System.out.println("Mobil pada objek m1 diubah menjadi warna hijau");
        // m1.setWarna("Hijau");
        // m1.displayMessage();
    }
}
